/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7794..0x9f7814 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f7794_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_9f7794_0;


long long sub_9f7794(long long *a0, unsigned long a1, unsigned long a2)
{
    st_9f7794_0 *v2;  // x22
    unsigned long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0 + 9;
    sub_a6c2e4(a0[9], "crypto/ct/ct_sct.c", 172);
    v2->field_18 = 0;
    v2->field_0 = 0;
    v2->field_8 = 0;
    if (!a1)
    {
        return 1;
    }
    else if (a2)
    {
        v3 = sub_a6dac4(a1, a2, "crypto/ct/ct_sct.c", 178);
        v2->field_0 = v3;
        if (!v3)
            return v3;
        a0[10] = a2;
        return 1;
    }
    else
    {
        return 1;
    }
}
