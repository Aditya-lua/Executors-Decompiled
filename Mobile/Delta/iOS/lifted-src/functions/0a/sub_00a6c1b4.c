/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6c1b4..0xa6c2e4 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6c1b4_0 {
    unsigned long long field_0;
} st_a6c1b4_0;

extern unsigned long long g_a6bf4c;
extern unsigned long long g_a6c2e4;
extern st_a6c1b4_0 *g_f09008;
extern unsigned long long g_f09010;
extern st_a6c1b4_0 *g_f09018;
extern char g_f12e80;

char sub_a6c1b4(unsigned long a0, char a1, char a2, unsigned long long a3)
{
    char ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f09010 != sub_a6c1b4)
    {
        goto *((void *)(g_f09010));
    }
    else
    {
        if (a0)
        {
            if (!a1)
            {
                if (g_f09018 != &g_a6c2e4)
                    g_f09018();
                _free();
            }
        }
        else
        {
            if (g_f09008 != &g_a6bf4c)
            {
                g_f09008();
            }
            else if (a1)
            {
                if (!(g_f12e80 & 1))
                    g_f12e80 = 1;
                ptr = _malloc(a1);
                if (ptr)
                {
                    return ptr;
                }
                else if (a2 || (unsigned int)a3)
                {
                    sub_a368c8();
                    sub_a369bc(a2, a3, 0);
                    sub_a36abc(15, 0xc0100, 0);
                }
            }
        }
        return 0;
    }
}
