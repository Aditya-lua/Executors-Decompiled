/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9947fc..0x9949d0 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9947fc_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[28];
    unsigned short field_30;
} st_9947fc_0;

extern unsigned long long g_e88c50;
extern unsigned long long g_e88e38;

unsigned long long sub_9947fc(unsigned long a0, unsigned long a1, int a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned short a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11, unsigned long a12, unsigned long a13, unsigned long a14, unsigned long long a15, unsigned long long a16, unsigned int a17, unsigned long long a18, unsigned long long a19, unsigned long a20, uint128_t a21, unsigned long a22, unsigned long long a23, unsigned long a24, unsigned int a25, uint128_t a26, unsigned long a27, unsigned long long a28, unsigned long long a29)
{
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    st_9947fc_0 *v13;  // x0
    unsigned long long v14;  // x8
    long long v15;  // x0
    unsigned long long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    uint128_t v2;  // [bp-0xa0], Other Possible Types: unsigned int
    unsigned long long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    uint128_t v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x70]
    st_9947fc_0 **v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    st_9947fc_0 **v10;  // [bp+0xb8]

    v9 = &a8;
    v7 = a29;
    v8 = v10;
    v6 = a28;
    v5 = a26;
    v4 = a23;
    v2 = a21;
    v0 = a18;
    v1 = a19;
    v11 = sub_9987e4();
    if ((unsigned int)v11 != 1)
        return v11;
    v12 = sub_954274();
    *(unsigned long long *)&(*v8)[86].padding_14[0] = v12;
    v13 = *v8;
    if (!*(long long *)&v13[86].padding_14[0])
    {
        v15 = sub_9949d0(v13);
        *v8 = 0;
        sub_a368c8(v15);
        sub_a369bc("ssl/record/methods/dtls_meth.c", 603, "dtls_new_record_layer");
        sub_a36abc(20, 0x80014, 0);
        return 0xfffffffe;
    }
    v13->field_10 = 1;
    v13->field_30 = a6;
    *(unsigned int *)&v13[87].padding_0[10] = 1;
    if (0xfefe >= a2)
    {
        if (a2 == 0x100)
            goto LABEL_994948;
        if (a2 == 65277)
            goto LABEL_994948;
LABEL_9948b8:
        sub_a368c8();
        sub_a369bc("ssl/record/methods/dtls_meth.c", 622, "dtls_new_record_layer");
        sub_a36abc(20, 0xc0103, 0);
        sub_9949d0(*v8);
        *v8 = 0;
        return 0xfffffffe;
    }
    switch (a2)
    {
    case 131071:
        v14 = &g_e88e38;
        break;
    case 65279:
LABEL_994948:
        v14 = &g_e88c50;
        break;
    default:
        goto LABEL_9948b8;
    }
    *(unsigned long long *)&v13[88].field_10 = v14;
    v3 = a18;
    v4 = a19;
    v2 = a17;
    v0 = a15;
    v1 = a16;
    (*(long long *)*(long long *)&(*v8)[88].field_10)();
}
