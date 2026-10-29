/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6bffc..0xa6c0cc (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6bffc_0 {
    unsigned long long field_0;
} st_a6bffc_0;

extern unsigned long long g_a6bf4c;
extern st_a6bffc_0 *g_f09008;
extern char g_f12e80;

char sub_a6bffc(long long a0, char a1, unsigned long long a2)
{
    char ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f09008 != &g_a6bf4c)
        g_f09008();
    if (!a0)
        return 0;
    if (!(g_f12e80 & 1))
        g_f12e80 = 1;
    ptr = _malloc(a0);
    if (ptr)
    {
        _bzero();
        return ptr;
    }
    else if (a1 || (unsigned int)a2)
    {
        sub_a368c8();
        sub_a369bc(a1, a2, 0);
        sub_a36abc(15, 0xc0100, 0);
    }
    return 0;
}
