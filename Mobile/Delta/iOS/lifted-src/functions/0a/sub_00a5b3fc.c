/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b3fc..0xa5b4d0 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5b3fc_1 {
    int field_0;
} st_a5b3fc_1;

typedef struct st_a5b3fc_0 {
    unsigned int field_0;
    char padding_4[28];
    long long field_20;
    char padding_28[56];
    struct st_a5b3fc_1 *field_60;
} st_a5b3fc_0;


unsigned int * sub_a5b3fc(st_a5b3fc_0 *a0)
{
    long long v3;  // x0
    int *v4;  // x0
    unsigned int v5;  // w20
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0->field_60)
    {
        v3 = sub_a7a42c(sub_975ff4(a0->field_60));
        if (sub_a5ee08(v3, sub_a551d4(a0->field_60, 12), 0))
        {
            sub_a5ed84();
            return 1;
        }
    }
    else
    {
        v4 = sub_9c5df4(&v0, a0->field_0);
        if (v4)
        {
            v5 = *v4;
            sub_a32e7c(v0);
            if (911 >= (int)v5)
            {
                switch (v5)
                {
                case 6:
                    return 1;
                case 116:
                    return 1;
                case 408:
                    return sub_a19d04(a0->field_20);
                default:
                    goto LABEL_a5b4a4;
                }
            }
            else if (v5 - 1087 < 2)
            {
                return 1;
            }
            else if (v5 == 912)
            {
                return 1;
            }
        }
        else
        {
            sub_a32e7c(v0);
        }
    }
LABEL_a5b4a4:
    return 0;
}
