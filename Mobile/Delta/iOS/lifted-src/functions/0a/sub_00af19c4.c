/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf19c4..0xaf1a9c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af19c4_0 {
    char padding_0[24];
    long long field_18;
    int field_20;
} st_af19c4_0;

extern char g_10002b0;

unsigned long long sub_af19c4(st_af19c4_0 *a0, long long a1, unsigned long a2, unsigned long long a3)
{
    long long v4;  // x19
    unsigned long long v5;  // x0
    unsigned long long v6;  // x22
    char v0;  // [bp-0x4c]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_a40ca8(a1, "SHA1");
    v5 = sub_afa378(a0, 0);
    if (a3)
        *(unsigned int *)a3 = 0;
    v6 = 0;
    if (!(v5 >> 31 & 1) && v4)
    {
        if (sub_a40abc(a0->field_18, a0->field_20, &v0, 0, v4, 0))
        {
            v6 = v0;
            if (a3)
                *(unsigned int *)a3 = 1;
        }
        else
        {
            v6 = 0;
        }
    }
    sub_a3f52c(v4);
    if (*(long long *)&g_10002b0 == v1)
        return v6;
    ___stack_chk_fail();
}
