/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad753c..0xad761c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad753c_0 {
    int field_0;
    char padding_4[4];
    long long field_8;
    long long field_10;
} st_ad753c_0;


void sub_ad753c(st_ad753c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    int v8;  // w8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_0;
    if (3 >= v8)
    {
        if (v8 == 1)
        {
            sub_a6c2e4(a0->field_8, "crypto/store/store_lib.c", 840);
            sub_a6c2e4(a0->field_10, "crypto/store/store_lib.c", 841);
        }
        else if (v8 == 2 || v8 == 3)
        {
            goto LABEL_ad75a4;
        }
    }
    else
    {
        if (v8 == 4)
        {
LABEL_ad75a4:
            sub_a5a4c8(a0->field_8);
        }
        else if (v8 == 5)
        {
            sub_afc404(a0->field_8);
        }
        else if (v8 == 6)
        {
            sub_af99a8(a0->field_8);
        }
        else
        {
            sub_a6c2e4();
            return;
        }
    }
    sub_a6c2e4();
    return;
}
