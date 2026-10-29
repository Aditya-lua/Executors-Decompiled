/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6c0cc..0xa6c1b4 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6c0cc_0 {
    unsigned long long field_0;
} st_a6c0cc_0;

extern unsigned long long g_a6bf4c;
extern st_a6c0cc_0 *g_f09008;
extern char g_f12e80;

unsigned long long sub_a6c0cc(unsigned long a0, unsigned long a1, char *a2, char a3, unsigned long long a4)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    char v16;  // x23
    char ptr;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    *(unsigned long long *)a2 = 0;
    v16 = a1 + a0;
    if (g_f09008 != &g_a6bf4c)
        g_f09008();
    if (v16)
    {
        if (!(g_f12e80 & 1))
            g_f12e80 = 1;
        ptr = _malloc(v16);
        if (ptr)
            goto LABEL_a6c184;
        if (a3 || (unsigned int)a4)
        {
            sub_a368c8();
            sub_a369bc(a3, a4, 0);
            sub_a36abc(15, 0xc0100, 0);
        }
    }
    ptr = 0;
LABEL_a6c184:
    *(unsigned long long *)a2 = ptr;
    if (ptr)
        return ptr + a1 - 1 & -a1;
    return 0;
}
