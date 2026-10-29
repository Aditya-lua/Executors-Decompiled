/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d019c..0x3d0298 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_3d019c(unsigned long a0, int a1, int a2, unsigned long long a3)
{
    unsigned long long v4;  // x24
    unsigned long long v5;  // x25
    unsigned long long i;  // x26
    long long node;  // x21
    long long iter;  // x22
    unsigned long long v9;  // x28
    unsigned long long j;  // x28
    unsigned long long n;  // x23
    char v0;  // [bp-0x870]
    unsigned long v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = a2 >> 1;
    if ((int)v4 >= 1)
    {
        v5 = a3 * a1;
        if (v5)
        {
            i = 0;
            do
            {
                node = a0 + i * v5;
                iter = a0 + (~(unsigned int)i + a2) * v5;
                v9 = v5;
                do
                {
                    j = v9;
                    if (j < 0x800)
                        n = j;
                    else
                        n = 0x800;
                    _memcpy();
                    _memcpy(node, iter, n);
                    _memcpy(iter, &v0, n);
                    iter += n;
                    node += n;
                    v9 = j - n;
                } while (j != n);
                i += 1;
            } while (i != v4);
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return;
    ___stack_chk_fail();
}
