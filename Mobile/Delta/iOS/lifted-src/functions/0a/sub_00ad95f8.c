/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad95f8..0xad9704 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad95f8_0 {
    unsigned int field_0;
    char padding_4[20];
    unsigned int field_18;
    char padding_1c[20];
    long long field_30;
    long long field_38;
} st_ad95f8_0;


int sub_ad95f8(st_ad95f8_0 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x8
    unsigned long long v13;  // x9
    unsigned long long v14;  // w0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        sub_ad9384(a0->field_30);
        v12 = a0->field_0;
        if (!(v12 & 5))
        {
            do
            {
                sub_ad9488(a0->field_38, a0->field_30);
                v12 = a0->field_0;
            } while (!(v12 & 5));
        }
        if (!(v12 >> 2 & 1))
        {
            while (1)
            {
                v13 = v12 & 0xffffffff;
                if (!(v13 >> 1 & 1))
                    break;
                if (!(v13 >> 2 & 1))
                {
                    sub_ad9488(a0->field_38, a0->field_30);
                    v12 = a0->field_0;
                }
                if (v12 >> 2 & 1)
                    goto LABEL_ad96a0;
            }
            a0->field_0 = (unsigned int)v12 | 2;
            sub_ad93b4(a0->field_30);
            v14 = (unsigned int)sub_ad92d4(a0, a1);
            sub_ad9384(a0->field_30);
            v12 = a0->field_0;
            if (v14)
                goto LABEL_ad96a0;
            a0->field_0 = (unsigned int)v12 & 0xfffbfffd | 0x40000;
            sub_ad94e8(a0->field_38);
            sub_ad93b4(a0->field_30);
            a0 = 0;
        }
        else
        {
LABEL_ad96a0:
            a0->field_0 = (unsigned int)v12 & 0xfffbfffb | 4;
            sub_ad94e8(a0->field_38);
            sub_ad93b4(a0->field_30);
            if (a1)
                *(unsigned int *)a1 = a0->field_18;
            a0 = 1;
        }
    }
    return (unsigned int)a0;
}
