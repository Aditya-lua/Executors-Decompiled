/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b0fc..0x97b1a4 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b0fc_0 {
    struct st_97b0fc_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[64];
    long long field_70;
} st_97b0fc_0;


st_97b0fc_0 * sub_97b0fc(st_97b0fc_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    st_97b0fc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(120, "ssl/quic/quic_demux.c", 78);
    if (!v2)
        return v2;
    v2->field_0 = a0;
    v2->field_8 = a1;
    v2->field_10 = 1500;
    v2->field_20 = a2;
    v2->field_28 = a3;
    if (!a0)
    {
        return v2;
    }
    else if (!sub_9d46fc(a0, 82, 0, 0))
    {
        return v2;
    }
    else if (sub_9d46fc(a0, 84, 1, 0))
    {
        *(char *)&v2->field_70 = 1;
        return v2;
    }
    else
    {
        return v2;
    }
}
