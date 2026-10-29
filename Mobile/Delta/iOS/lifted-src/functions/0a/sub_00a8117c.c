/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8117c..0xa812c0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a812c0;
extern long long g_a81314;
extern char g_10002b0;

long long sub_a8117c(long long a0, long long a1, unsigned int a2, uint128_t *a3, void* a4, void* a5)
{
    unsigned long v8;  // x25
    unsigned long v9;  // x24
    long long v10;  // x22
    unsigned long v11;  // x26
    unsigned long v12;  // x25
    unsigned long v13;  // x23
    unsigned long v14;  // x24
    unsigned long v15;  // x19
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    unsigned short v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = (long long)a4[8];
    v9 = (long long)a5[8];
    if (a2 == 4)
        v10 = &g_a812c0;
    else
        v10 = &g_a81314;
    v0 = *a3;
    v1 = a3[1];
    v2 = a3[2];
    v3 = a3[3];
    v4 = 0;
    if ((long long)a4[8])
    {
        v11 = 0;
        do
        {
            v12 = v8;
            if (!sub_a8137c(a0, a1, v10, &v0, *(long long *)a4 + v11))
                goto LABEL_a81274;
        } while ((*(char *)&v4 = (char)v4 + 1, v11 += 0x400, v8 = v12 - 1, v12 != 1));
    }
    if ((long long)a5[8])
    {
        v13 = 0;
        while (1)
        {
            v14 = v9;
            if (!sub_a8137c(a0, a1, v10, &v0, *(long long *)a5 + v13))
                break;
            *(char *)&v4 = (char)v4 + 1;
            v13 += 0x400;
            v9 = v14 - 1;
            if (v14 == 1)
                goto LABEL_a8126c;
        }
LABEL_a81274:
        v15 = 0;
    }
    else
    {
LABEL_a8126c:
        v15 = 1;
    }
    sub_a66ec0(&v0, 66);
    if (*(long long *)&g_10002b0 == v5)
        return v15;
    ___stack_chk_fail();
}
