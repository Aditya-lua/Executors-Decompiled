/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d1c6c..0x9d1e30 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9d1c6c(void* a0, unsigned int a1, char *a2)
{
    char *v4;  // x20
    unsigned long i;  // x8
    unsigned long long v14;  // x0
    char *v6;  // x9
    char *v7;  // x10
    char *v8;  // x10
    char *v9;  // x10
    char *v10;  // x10
    char *v11;  // x10
    unsigned long long j;  // x20
    unsigned long v13;  // x21
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2;
    v1 = *(long long *)&g_10002b0;
    _memcpy();
    i = 0;
    v6 = &v4[((int)a1 < 72 ? a1 : 72)];
    v7 = v4;
    do
    {
        v8 = v7 + 1;
        if (v8 >= v6)
            v8 = v4;
        v9 = v8 + 1;
        if (v9 >= v6)
            v9 = v4;
        v10 = v9 + 1;
        if (v10 >= v6)
            v10 = v4;
        v11 = v10 + 1;
        if (v11 >= v6)
            v11 = v4;
        *(unsigned int *)((char *)a0 + i) = (*v10 | (*v7 * 0x10000 | *v8 * 0x100 | *v9) * 0x100) ^ *(int *)((char *)a0 + i);
        i += 4;
        v7 = v11;
    } while (i != 72);
    v0 = 0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)a0 = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[8] = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[16] = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[24] = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[32] = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[40] = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[48] = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[56] = v0;
    sub_9d0e94(&v0, a0);
    *(unsigned long *)&a0[64] = v0;
    j = 0xfffffffffffffffe;
    v13 = 72;
    do
    {
        v14 = sub_9d0e94(&v0, a0);
        *(unsigned long *)((char *)a0 + v13) = v0;
        j += 2;
        v13 += 8;
    } while (j < 0x3fe);
    if (*(long long *)&g_10002b0 == v1)
        return v14;
    ___stack_chk_fail();
}
