/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2fa8..0x9f3078 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2fa8_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_9f2fa8_0;


void sub_9f2fa8(st_9f2fa8_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    long long *v19;  // x21
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x19
    unsigned int v17;  // w0
    unsigned int i;  // w23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a0->field_8)
        return;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_10;
    v17 = sub_ad69e4(v16);
    if ((int)v17 >= 1)
    {
        i = v17 + 1;
        do
        {
            v19 = sub_ad69f8(v16, i - 2);
            sub_a6c2e4(v19[2], "crypto/conf/conf_api.c", 176);
            sub_a6c2e4(v19[1], "crypto/conf/conf_api.c", 177);
            sub_a6c2e4(v19, "crypto/conf/conf_api.c", 178);
            i -= 1;
        } while (1 < i);
    }
    sub_ad6020(v16);
    sub_a6c2e4(a0->field_0, "crypto/conf/conf_api.c", 181);
    sub_a6c2e4();
    return;
}
