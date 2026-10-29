// Normalized pseudocode for stock Luau/runtime initializers embedded in
// libgloop.dylib. This is not the original vendor source.

#include <array>
#include <cstddef>
#include <cstdint>
#include <cstring>

struct LuauFlagNode {
    std::uint16_t value;
    std::uint8_t padding[6];
    const char* name;
    LuauFlagNode* next;
    std::uint32_t override_value;
};

extern LuauFlagNode* g_luau_boolean_flags; // native 0xf011c0
extern LuauFlagNode* g_luau_integer_flags; // native 0xf011c8

// Native 0x137d0. The routine searches both flag lists and updates every node
// whose name matches. The first argument is ABI residue/return passthrough.
void reconstructed_set_luau_flag_override(const char* name,
                                          std::uint32_t override_value) {
    for (LuauFlagNode* node = g_luau_boolean_flags; node; node = node->next)
        if (std::strcmp(node->name, name) == 0)
            node->override_value = override_value;

    for (LuauFlagNode* node = g_luau_integer_flags; node; node = node->next)
        if (std::strcmp(node->name, name) == 0)
            node->override_value = override_value;
}

// Native 0x5852c links these four nodes into Luau's boolean-flag list. It then
// applies override value 2 to LuauGcTraceUdata.
static constexpr std::array<const char*, 4> kRecoveredGcFlags = {
    "LuauUdataMetatablePinned",
    "LuauGcTableStepFix",
    "LuauGcTraceUdata",
    "LuauGcMarkUdataAccess",
};

struct ThresholdLookupTable {
    std::uint32_t thresholds[36]; // +0x000
    std::uint8_t reserved[16];    // +0x090
    std::uint8_t bucket[1025];    // +0x0a0
    std::uint8_t alignment[3];    // +0x4a1
    std::uint32_t threshold_count;// +0x4a4
};

static_assert(offsetof(ThresholdLookupTable, bucket) == 160);
static_assert(offsetof(ThresholdLookupTable, threshold_count) == 1188);
static_assert(sizeof(ThresholdLookupTable) == 1192);

// Native 0x58634, called once by constructor 0x589a4 for global 0xf0d674.
// The consumer-facing purpose of the table is not named because no independent
// semantic evidence survives; the layout and contents are exact.
void reconstructed_build_threshold_lookup(ThresholdLookupTable& table) {
    static constexpr std::array<std::uint32_t, 36> thresholds = {
        8, 16, 24, 32, 40, 48, 56, 64,
        80, 96, 112, 128, 144, 160, 176, 192,
        208, 224, 240, 256, 288, 320, 352, 384,
        416, 448, 480, 512, 576, 640, 704, 768,
        832, 896, 960, 1024,
    };

    std::memset(&table, 0, sizeof(table));
    std::memset(table.bucket, 0xff, sizeof(table.bucket));
    table.threshold_count = static_cast<std::uint32_t>(thresholds.size());

    for (std::size_t index = 0; index < thresholds.size(); ++index) {
        table.thresholds[index] = thresholds[index];
        table.bucket[thresholds[index]] = static_cast<std::uint8_t>(index);
    }

    for (std::size_t value = 1024; value != 0; --value)
        if (static_cast<std::int8_t>(table.bucket[value - 1]) < 0)
            table.bucket[value - 1] = table.bucket[value];
}
