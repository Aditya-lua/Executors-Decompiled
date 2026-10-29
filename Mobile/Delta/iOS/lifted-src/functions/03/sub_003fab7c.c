/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3fab7c..0x3fac04 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3fab7c_0 {
    char field_0;
} st_3fab7c_0;

extern unsigned long long g_e80630;

void sub_3fab7c(unsigned long long a0, char *i, char *a2, char *a3)
{
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    char *v14;  // x1
    unsigned long long v0;  // [bp-0x50]
    st_3fab7c_0 **v1;  // [bp-0x48]
    char *v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    char *v4;  // [bp-0x30]
    char *v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v6 = v11;
    v7 = v12;
    v8 = &v10;
    v9 = v13;
    v5 = a3;
    v4 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (i != a2)
    {
        do
        {
            v14 = i + 1;
            *a3 = *i;
            a3 = v5 + 1;
            v5 = a3;
            i = v14;
        } while (i != a2);
    }
    v3 = 1;
    (g_e80630 - 0x4d159b00)();
}
