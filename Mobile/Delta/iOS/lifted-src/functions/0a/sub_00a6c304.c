/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6c304..0xa6c4e8 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6c304_0 {
    unsigned long long field_0;
} st_a6c304_0;

extern unsigned long long g_a6bf4c;
extern unsigned long long g_a6c2e4;
extern st_a6c304_0 *g_f09008;
extern st_a6c304_0 *g_f09018;
extern char g_f12e80;

long long sub_a6c304(long long a0, char a1, char a2, char a3, unsigned long long a4)
{
    char ptr;  // x0
    char ptr1;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (!a2)
        {
            if (a1)
                sub_a66ec0();
            if (g_f09018 == &g_a6c2e4)
            {
                _free();
                return 0;
            }
            g_f09018();
        }
        else if (a1 > a2)
        {
            sub_a66ec0(a0 + a2, a1 - a2);
            return a0;
        }
        else if (g_f09008 != &g_a6bf4c)
        {
            g_f09008();
        }
        else
        {
            if (!(g_f12e80 & 1))
                g_f12e80 = 1;
            ptr = _malloc(a2);
            if (ptr)
            {
                _memcpy();
                if (a1)
                    sub_a66ec0(a0, a1);
                if (g_f09018 == &g_a6c2e4)
                {
                    _free(a0);
                    return ptr;
                }
                g_f09018();
            }
        }
    }
    else
    {
        if (g_f09008 != &g_a6bf4c)
        {
            g_f09008();
        }
        else if (a2)
        {
            if (!(g_f12e80 & 1))
                g_f12e80 = 1;
            ptr1 = _malloc(a2);
            if (ptr1)
                return ptr1;
        }
        else
        {
            return 0;
        }
    }
    if (!a3 && !(unsigned int)a4)
        return 0;
    sub_a368c8();
    sub_a369bc(a3, a4, 0);
    sub_a36abc(15, 0xc0100, 0);
    return 0;
}
