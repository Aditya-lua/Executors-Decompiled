/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0ff20..0xa10314 (1012 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a0ff20(long long a0, long long a1)
{
    unsigned int i;  // w20
    unsigned int v8;  // w20
    unsigned int j;  // w20
    unsigned int v10;  // w20
    unsigned int k;  // w20
    unsigned int v12;  // w20
    unsigned long long v13;  // x0
    char v0;  // [bp-0xc8]
    char v1;  // [bp-0xa0]
    char v2;  // [bp-0x78]
    char v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    sub_a113ac(&v3);
    sub_a113ac(&v2, &v3);
    sub_a113ac(&v2, &v2);
    sub_a10314(&v2, a1, &v2);
    sub_a10314(&v3, &v3, &v2);
    sub_a113ac(&v1, &v3);
    sub_a10314(&v2, &v2, &v1);
    sub_a113ac(&v1, &v2);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a10314(&v2, &v1, &v2);
    sub_a113ac(&v1, &v2);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a10314(&v1, &v1, &v2);
    sub_a113ac(&v0, &v1);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a113ac(&v0, &v0);
    sub_a10314(&v1, &v0, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a113ac(&v1, &v1);
    sub_a10314(&v2, &v1, &v2);
    sub_a113ac(&v1, &v2);
    i = 49;
    do
    {
        v8 = i;
        sub_a113ac(&v1, &v1);
        i = v8 - 1;
    } while (i);
    sub_a10314(&v1, &v1, &v2);
    sub_a113ac(&v0, &v1);
    j = 99;
    do
    {
        v10 = j;
        sub_a113ac(&v0, &v0);
        j = v10 - 1;
    } while (j);
    sub_a10314(&v1, &v0, &v1);
    sub_a113ac(&v1, &v1);
    k = 49;
    do
    {
        v12 = k;
        sub_a113ac(&v1, &v1);
        k = v12 - 1;
    } while (k);
    sub_a10314(&v2, &v1, &v2);
    sub_a113ac(&v2, &v2);
    sub_a113ac(&v2, &v2);
    sub_a113ac(&v2, &v2);
    sub_a113ac(&v2, &v2);
    sub_a113ac(&v2, &v2);
    v13 = sub_a10314(a0, &v2, &v3);
    if (*(long long *)&g_10002b0 == v4)
        return v13;
    ___stack_chk_fail();
}
