/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c19dc..0x9c1a94 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c19dc_0 {
    char padding_0[4];
    unsigned int field_4;
} st_9c19dc_0;

extern char g_10002b0;

void sub_9c19dc(st_9c19dc_0 *a0, unsigned long long a1)
{
    unsigned long long v3;  // x8
    unsigned long long i;  // x1
    unsigned int v6;  // w9
    unsigned long long v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long j;  // x9
    unsigned long v11;  // [bp-0x20]
    unsigned long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if ((long long)a1 >= 0)
    {
        v3 = 7;
        do
        {
            i = a1;
            *((char *)&v11 + v3) = i;
            v3 -= 1;
            a1 = i >> 8;
        } while (0x100 <= i);
        v6 = 2;
    }
    else
    {
        v7 = -a1;
        v8 = 7;
        do
        {
            j = v7;
            *((char *)&v11 + v8) = j;
            v8 -= 1;
            v7 = j >> 8;
        } while (0x100 <= j);
        v6 = 258;
    }
    a0->field_4 = v6;
    sub_9c7770();
    if (*(long long *)&g_10002b0 == v0)
        return;
    ___stack_chk_fail();
}
