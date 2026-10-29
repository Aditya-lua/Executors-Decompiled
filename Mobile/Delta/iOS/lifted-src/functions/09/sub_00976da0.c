/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976da0..0x976edc (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976da0_0 {
    long long field_0;
    char padding_8[208];
    long long field_d8;
    char padding_e0[824];
    long long field_418;
    long long field_420;
    char padding_428[480];
    unsigned long long field_608;
    unsigned long long field_610;
    unsigned long long field_618;
    unsigned long long field_620;
} st_976da0_0;


void sub_976da0(unsigned long a0, st_976da0_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // x0
    unsigned long long v18;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    unsigned long long v16;  // 4110
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a1->field_620;
    if ((v12 & 0x400000400) != 0x400)
    {
        sub_979174();
        return;
    }
    v13 = sub_975f2c(a1->field_418);
    a1->field_620 = a1->field_620 & 0xffffffff7fffffff | 0x600000000;
    a1->field_618 = a0;
    v14 = sub_981238(a1->field_0);
    v15 = v14 + v13;
    v16 = arm64g_calculate_condition(50, v14, v13, 0);
    if (!(v16 & 1))
        v15 = 0xffffffffffffffff;
    a1->field_608 = v15;
    a1->field_620 = a1->field_620 & 0xffffffefffffffff;
    if (!(v12 >> 31 & 1))
    {
        v17 = sub_98d8bc(a1->field_d8, 2);
        if (v17 <= 0x3fffffffffffffff && sub_9857f0(a1->field_420))
        {
            v18 = a1->field_620;
            a1->field_610 = v17;
            a1->field_620 = v18 & 0xffffffefffffffff | v18 * 32 & 0x1000000000 | 0x100000000;
        }
        else
        {
            sub_979174(a1, 1, 0, "key update", 0, "ssl/quic/quic_channel.c", 740, "ch_trigger_txku");
        }
    }
}
