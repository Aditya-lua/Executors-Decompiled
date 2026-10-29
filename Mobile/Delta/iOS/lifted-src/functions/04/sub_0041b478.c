/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41b478..0x41bc0c (1940 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41b478_0 {
    char field_0;
} st_41b478_0;

extern unsigned long long g_e81298;

long long sub_41b478(unsigned long a0, long long a1, unsigned int a2)
{
    unsigned int v7;  // w0
    unsigned long long v8;  // x8
    unsigned int v0;  // [bp-0xc4]
    st_41b478_0 **v1;  // [bp-0xc0], Other Possible Types: char
    st_41b478_0 *v2;  // [bp-0xb8]
    char v3;  // [bp-0x65]
    unsigned int v4;  // [bp-0x64]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v0 = a2;
    v2 = &v1;
    v1 = &v2;
    v4 = 0;
    v3 = 0;
    if (!sub_6b08(a1))
        return 0;
    v7 = sub_43a824(&v3, &v4, *(char *)sub_2fa10(a1, 0));
    v8 = 0x100;
    if (!v7)
        v8 = 8;
    if (v7 == 1)
        v8 = 48;
    goto *((void *)(*(long long *)((char *)&g_e81298 + v8)));
}
