// Evidence-based pseudocode. This is not the vendor's original source.

#include <cstddef>

using Sink = void (*)(const char*);

static void inert_sink(const char*) {
    // Exact native target 0xd1864 is a single ARM64 `ret`.
}

static const char* const anti_reversing_decoys[5] = {
    // Preserved verbatim because this file is an evidentiary reconstruction.
    // The first entry contains an offensive racial slur present in the binary.
    "SHOUTOUT MY NIGGA TIAHH THX FOR RUINING ALL OTHER SHITSPLOITS HAIL DELTA",
    "hello saar what is u tryin to skid? you will NEVER be able to compete, give up now saar dont waste time",
    "s-s-saaar...? hoew by pass wor[k]?",
    "take us to agartha",
    nullptr,
};

void reconstructed_troll_loop() {
    Sink sink = inert_sink;
    for (std::size_t index = 0; index < 5; ++index)
        sink(anti_reversing_decoys[index]);
}
