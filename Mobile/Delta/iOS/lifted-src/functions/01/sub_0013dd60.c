/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13dd60..0x13de24 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13dd60_0 {
    char field_0;
} st_13dd60_0;

typedef struct st_13dd60_1 {
    char padding_0[256];
    unsigned long long field_100;
} st_13dd60_1;

typedef struct st_13dd60_2 {
    char padding_0[96];
    struct st_13dd60_1 *field_60;
} st_13dd60_2;

extern st_13dd60_2 *g_f0d198;
extern unsigned long long g_f0d450;
extern unsigned long long g_f0d458;
extern char g_f0d468;

unsigned long long sub_13dd60(void)
{
    unsigned long long v8;  // x9
    st_13dd60_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_13dd60_0 *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x30]
    char v3;  // [bp-0x28]
    st_13dd60_0 **v4;  // [bp-0x20], Other Possible Types: char
    st_13dd60_0 *v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (~g_f0d198->field_60->field_100 & 0x800000000000400)
        return 0;
    v5 = &v4;
    v4 = &v5;
    v2 = &g_f0d468;
    v3 = 1;
    std::__1::__shared_mutex_base::lock(&g_f0d468);
    if (g_f0d450 != g_f0d458)
    {
        v8 = g_f0d450;
        do
        {
            if (*(long long *)v8)
                *(char *)(*(long long *)v8 + 81) = 0;
        } while ((v8 += 8, v8 != g_f0d458));
    }
    sub_c84c(&g_f0d450);
    sub_13e9ac(&v2);
    return 0;
}
