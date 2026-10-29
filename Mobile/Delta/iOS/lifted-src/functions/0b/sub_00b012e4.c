/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb012e4..0xb01390 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b012e4_0 {
    char padding_0[84];
    char field_54;
} st_b012e4_0;

extern long long g_9b8de4;
extern long long g_9b96e0;
extern unsigned long long g_9bb300;
extern unsigned int g_f0d568;

int sub_b012e4(st_b012e4_0 *a0, long long a1, unsigned int a2)
{
    unsigned long long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(g_f0d568 >> 2 & 1))
    {
        sub_9b8880(a1, a2 * 8, &a0[8].padding_0[24]);
        sub_a94ad4(&a0[2].padding_0[78], &a0[8].padding_0[24], &g_9b8de4);
        if (!(g_f0d568 & 1))
        {
            *(unsigned long long *)&a0[8].padding_0[16] = 0;
        }
        else
        {
            v2 = "_ ";
LABEL_b01370:
            *(unsigned long long *)&a0[8].padding_0[16] = v2;
        }
    }
    else
    {
        sub_9b9440(a1, a2 * 8, &a0[8].padding_0[24]);
        sub_a94ad4(&a0[2].padding_0[78], &a0[8].padding_0[24], &g_9b96e0);
        v2 = &g_9bb300;
        goto LABEL_b01370;
    }
    a0->field_54 = a0->field_54 | 4;
    return 1;
}
