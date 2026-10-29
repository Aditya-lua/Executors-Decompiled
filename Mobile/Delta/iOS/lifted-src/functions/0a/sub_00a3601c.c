/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3601c..0xa361e8 (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7fffff;
extern long long g_f128d0;
extern long long g_f128d8;
extern char g_f128e0;
extern char g_1000000;
extern char g_10002b0;

unsigned long long sub_a3601c(unsigned long long a0, unsigned long long a1, long long a2, unsigned long long a3)
{
    unsigned long long len;  // x0
    unsigned long long v10;  // x25
    unsigned long long v11;  // x8
    unsigned long long v12;  // x23
    unsigned long long v13;  // x26
    unsigned int v14;  // w8
    long long v15;  // x23
    unsigned long long v16;  // x0
    unsigned long long v0;  // [bp-0x1d0]
    unsigned long long v1;  // [bp-0x1c8]
    unsigned long long v2;  // [bp-0x1c0]
    long long v3;  // [bp-0x1b8], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x1a8]
    char v5;  // [bp-0xa8]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    len = a0;
    if (a3)
    {
        if (0 <= (int)a0)
            v10 = (a0 * 0x20000000000 | a0 >> 23) & 0xfffffe00000001ff & 0x1ff;
        else
            v10 = 2;
        if (sub_a7c208() && *(int *)&g_f128e0)
        {
            v11 = a0 & 0xff800000;
            if (0 > (int)a0)
                v11 = &g_1000000;
            v4 = v11;
            if (sub_a7c17c())
            {
                v12 = sub_a66b6c(g_f128d8, &v4);
                sub_a7c1b4(g_f128d0);
                if (v12 && !(v13 = *(long long *)(v12 + 8), !*(long long *)(v12 + 8)))
                    goto LABEL_a360fc;
            }
        }
        v0 = v10;
        v13 = &v5;
        sub_9d5b44(&v5, 64, "lib(%lu)");
LABEL_a360fc:
        if (!(a0 & 0x80000000))
            v14 = (unsigned int)&g_7fffff;
        else
            v14 = 0x7fffffff;
        v15 = v14 & (unsigned int)a0;
        if (!(a0 >> 31 & 1))
        {
            v16 = sub_a361e8(a0);
            if (!v16)
                goto LABEL_a36140;
        }
        else
        {
            v16 = &v4;
            if (!sub_a6e1a4(v15, &v4, 0x100))
            {
LABEL_a36140:
                v0 = v15 & 0xff83ffff;
                v16 = &v4;
                sub_9d5b44(&v4, 0x100, "reason(%lu)");
            }
        }
        v2 = a1;
        v3 = v16;
        v0 = a0;
        v1 = v13;
        sub_9d5b44(a2, a3, "error:%08lX:%s:%s:%s");
        len = _strlen(a2);
        if (len == a3 - 1)
        {
            v2 = 0;
            v3 = v15;
            v0 = a0;
            v1 = v10;
            len = sub_9d5b44(a2, a3, "err:%lx:%lx:%lx:%lx");
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return len;
    ___stack_chk_fail();
}
