/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6bf4c..0xa6bffc (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6bf4c_0 {
    unsigned long long field_0;
} st_a6bf4c_0;

extern st_a6bf4c_0 *g_f09008;
extern char g_f12e80;

int sub_a6bf4c(unsigned long long ptr, char a1, unsigned long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f09008 != sub_a6bf4c)
        g_f09008();
    if (ptr)
    {
        if (!(g_f12e80 & 1))
            g_f12e80 = 1;
        ptr = _malloc();
        if (!ptr)
        {
            if (a1 || (unsigned int)a2)
            {
                sub_a368c8();
                sub_a369bc(a1, a2, 0);
                sub_a36abc(15, 0xc0100, 0);
            }
            ptr = 0;
        }
    }
    return ptr;
}
