/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xade218..0xade2dc (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ade218_1 {
    long long field_0;
    long long field_8;
    long long field_10;
} st_ade218_1;

typedef struct st_ade218_0 {
    char padding_0[1];
    char field_1;
    char padding_2[14];
    struct st_ade218_1 *field_10;
    struct st_ade218_0 *field_18;
    long long field_20;
    long long field_28;
    long long field_30;
} st_ade218_0;

extern long long g_addb74;
extern long long g_ade2dc;

void sub_ade218(st_ade218_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_ade218_0 *i;  // w21
    long long *v13;  // x22
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_ad6020(a0->field_28);
    sub_ad6958(a0->field_30, &g_ade2dc);
    if ((int)a0->field_18 >= 1)
    {
        i = (st_ade218_0 *)0;
        v13 = &a0->field_10->field_0;
        do
        {
            sub_afc404(*v13);
            sub_ad6958(v13[1], sub_ade168);
            sub_ade168(v13[2]);
            i = &i->field_1;
            v13 += 4;
        } while (i < (int)a0->field_18);
    }
    sub_ad6958(a0->field_20, &g_addb74);
    sub_a6c2e4(a0->field_10, "crypto/x509/pcy_tree.c", 646);
    sub_a6c2e4();
    return;
}
