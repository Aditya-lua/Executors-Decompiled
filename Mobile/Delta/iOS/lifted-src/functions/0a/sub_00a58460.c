/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58460..0xa58724 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a58460_0 {
    struct st_a58460_0 *field_0;
    char padding_8[48];
    struct st_a58460_1 *field_38;
    struct st_a58460_0 *field_40;
    char padding_48[56];
    struct st_a58460_0 *field_80;
} st_a58460_0;

typedef struct st_a58460_1 {
    unsigned long long field_0;
} st_a58460_1;

extern char g_10002b0;

st_a58460_0 * sub_a58460(unsigned long a0, unsigned long a1, unsigned long a2, st_a58460_0 *a3, unsigned long a4, st_a58460_0 *a5, st_a58460_0 *a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, st_a58460_0 *a11)
{
    st_a58460_0 *v8;  // x19
    long long v9;  // x0
    long long v10;  // x25
    st_a58460_0 *v11;  // x0
    st_a58460_0 *v12;  // x8
    st_a58460_0 *v0;  // [bp-0xc8]
    st_a58460_0 *v1;  // [bp-0xc0]
    st_a58460_0 *v2;  // [bp-0xb0]
    st_a58460_0 *v3;  // [bp-0xa0]
    st_a58460_0 *v4;  // [bp-0x90]
    st_a58460_0 *v5;  // [bp-0x80]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]

    v7 = &a8;
    v6 = *(long long *)&g_10002b0;
    v8 = sub_a58724();
    v4 = (st_a58460_0 *)0;
    v5 = (st_a58460_0 *)0;
    v2 = (st_a58460_0 *)0;
    v3 = (st_a58460_0 *)0;
    v1 = (st_a58460_0 *)0;
    v0 = 0;
    if (a11)
        a11->field_0 = 0;
    if (v8)
    {
        if (a3)
        {
            v9 = sub_a58b28(v8);
            v10 = "digest";
            if (sub_a6fbc4(v9, "digest") || (v10 = "cipher", sub_a6fbc4(v9, "cipher")))
            {
                sub_a71618(v10, a3, 0);
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/mac_lib.c", 283, "EVP_Q_mac");
                sub_a36abc(6, 0x80106, 0);
LABEL_a58688:
                sub_a58aa4(v8);
                if (*(long long *)&g_10002b0 == v6)
                    return 0;
                ___stack_chk_fail();
            }
        }
        v11 = sub_a57e48();
        if (v11)
        {
            v12 = v11->field_0;
            if (v12->field_80)
            {
                v12->field_80();
            }
            else if (v12->field_40)
            {
                v12->field_40();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/mac_lib.c", 0x77, "EVP_MAC_init");
                sub_a36abc(0x80006, 0x8010c, 0);
                v11->field_0->field_38();
            }
        }
        goto LABEL_a58688;
    }
    else
    {
        if (*(long long *)&g_10002b0 == v6)
            return 0;
        ___stack_chk_fail();
    }
}
