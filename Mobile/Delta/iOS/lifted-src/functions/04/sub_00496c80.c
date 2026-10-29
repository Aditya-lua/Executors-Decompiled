/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x496c80..0x496eac (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_496c80_0 {
    char field_0;
} st_496c80_0;

extern unsigned long long g_e80840;
extern unsigned long long g_e80850;

void sub_496c80(void* a0, unsigned long a1)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    st_496c80_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_496c80_0 *v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x5c]
    unsigned long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0[40])
    {
        v3 = 0;
        v2 = 0;
        (g_e80850 - 0x56e9b600)();
    }
    (g_e80840 - 0x7ec4bd00)();
}
