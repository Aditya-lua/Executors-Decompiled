/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3b234..0xb3b2f0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3b234_0 {
    char padding_0[8];
    unsigned int field_8;
} st_b3b234_0;


st_b3b234_0 * sub_b3b234(unsigned long a0, unsigned int a1, unsigned long a2)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    unsigned int idx;  // x0
    st_b3b234_0 *v5;  // x0
    unsigned int v6;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    v3 = sub_a2f9e0(v2);
    if (!(a1 & 135))
    {
        return 0;
    }
    else if (v3)
    {
        idx = sub_a6bffc(152, "providers/implementations/keymgmt/ec_kmgmt.c", 978);
        if (!idx)
            return idx;
        *(long long *)idx = v2;
        *(unsigned int *)(idx + 120) = a1;
        *(unsigned int *)(idx + 124) = 0;
        v5 = (st_b3b234_0 *)idx;
        if (sub_b3a440())
        {
            if (!*(long long *)&v5->field_8)
            {
                v6 = sub_a6d9b4("sm2", "providers/implementations/keymgmt/ec_kmgmt.c", 1001);
                *(unsigned long long *)&v5->field_8 = v6;
                if (v6)
                    return v5;
            }
            else
            {
                return v5;
            }
        }
        sub_b3aa44(v5);
        return 0;
    }
    else
    {
        return 0;
    }
}
