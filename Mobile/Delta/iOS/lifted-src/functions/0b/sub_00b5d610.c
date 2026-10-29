/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d610..0xb5d6f4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5d610_0 {
    char padding_0[136];
    unsigned int field_88;
} st_b5d610_0;

extern char g_10002b0;

unsigned int sub_b5d610(st_b5d610_0 *a0, unsigned long a1, long long a2, long long a3, long long a4, long long a5)
{
    unsigned int v4;  // w0
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (*(long long *)&a0->field_88)
    {
LABEL_b5d6a8:
        sub_a66ec0(a2, a3);
        v4 = 0;
    }
    else
    {
        if (sub_a937c8(&a0->padding_0[80]) || !sub_a94058(&a0->padding_0[80], &v0, a5) || sub_a66f20(&v0, a4, a5))
            goto LABEL_b5d6a8;
        v4 = 1;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
