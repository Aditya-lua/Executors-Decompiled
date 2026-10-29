/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9f260..0xb9f3a8 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9f260_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
} st_b9f260_0;


unsigned long long sub_b9f260(unsigned long long a0, unsigned long long a1)
{
    unsigned long long i;  // x23
    unsigned long long v3;  // x0
    unsigned long long v4;  // x23
    st_b9f260_0 *v5;  // x24
    unsigned long v6;  // x26
    unsigned long v7;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    for (v3 = a0; i != a1; i = v4)
    {
        v4 = i + 1;
        v5 = a0 + i * 32;
        v3 = v5->field_10;
        v6 = v5->field_18 + 1;
        while (1)
        {
            v7 = v6 - 1;
            if (v6 == 1)
                break;
            v3 += 56;
            sub_b9b19c();
            v6 = v7;
        }
        i = v4;
        if (v5->field_8)
            v3 = _free(v5->field_10);
    }
    return v3;
}
