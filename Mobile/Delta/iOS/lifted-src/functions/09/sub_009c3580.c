/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3580..0x9c3624 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c3580_0 {
    long long field_0;
    long long field_8;
    char padding_10[8];
    long long field_18;
    unsigned int field_20;
} st_9c3580_0;


st_9c3580_0 * sub_9c3580(st_9c3580_0 *a0)
{
    unsigned long v2;  // x8
    st_9c3580_0 *v3;  // x0
    st_9c3580_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = a0->field_20;
    if (!(v2 >> 2 & 1))
    {
        v3 = a0;
        if (v2 >> 3 & 1)
            goto LABEL_9c35e4;
LABEL_9c35a0:
        if (!(v2 & 1))
            return v3;
    }
    else
    {
        sub_a6c2e4(a0->field_0, "crypto/asn1/a_object.c", 354);
        v3 = sub_a6c2e4(a0->field_8, "crypto/asn1/a_object.c", 355);
        a0->field_0 = 0;
        a0->field_8 = 0;
        v2 = a0->field_20;
        if (!(v2 >> 3 & 1))
            goto LABEL_9c35a0;
LABEL_9c35e4:
        v4 = sub_a6c2e4(a0->field_18, "crypto/asn1/a_object.c", 360);
        a0->field_18 = 0;
        *(unsigned int *)&a0->padding_10[4] = 0;
        if (!(a0->field_20 & 1))
            return v4;
    }
    return sub_a6c2e4();
}
