/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6086c..0x608dc (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6086c_1 {
    char padding_0[24];
    struct st_6086c_0 *field_18;
} st_6086c_1;

typedef struct st_6086c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
} st_6086c_0;

extern char g_e69950;

long long sub_6086c(int a0, unsigned long a1)
{
    long long t;  // x0
    st_6086c_0 *v7;  // x0
    st_6086c_1 *v8;  // x8
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    t = std::__1::chrono::system_clock::now();
    v7 = sub_607c4(t);
    v2 = 1;
    v7->field_0 = &g_e69950;
    v7->field_8 = a1;
    v7->field_10 = t;
    v7->field_18 = a0;
    v0 = 0;
    v1 = &v3;
    v8->field_18 = v7;
    return sub_607ac(&v0);
}
