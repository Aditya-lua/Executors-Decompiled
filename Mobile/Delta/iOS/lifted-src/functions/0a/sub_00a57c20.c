/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa57c20..0xa57e08 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a57c20_0 {
    char padding_0[200];
    struct st_a57c20_1 *field_c8;
} st_a57c20_0;

typedef struct st_a57c20_2 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a57c20_0 *field_28;
} st_a57c20_2;

typedef struct st_a57c20_3 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_a57c20_2 *field_28;
} st_a57c20_3;

typedef struct st_a57c20_1 {
    unsigned long long field_0;
} st_a57c20_1;


unsigned long long sub_a57c20(st_a57c20_3 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_a57c20_2 *v2;  // x25
    st_a57c20_0 *v3;  // x23
    unsigned long long v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_28;
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 760, "EVP_DigestVerify");
        sub_a36abc(6, 134, 0);
    }
    else if (a0->field_18 >> 11 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 765, "EVP_DigestVerify");
        sub_a36abc(6, 188, 0);
        return 0;
    }
    else if (v2->field_0 != 0x100 || !*(long long *)&v2[1].field_0 || (v3 = v2->field_28, !v3))
    {
        v4 = *(long long *)&v2[2].padding_4[20];
        if (v4 && *(long long *)(v4 + 216))
            goto *((void *)(*(long long *)(v4 + 216)));
    }
    else if (v3->field_c8)
    {
        a0->field_18 = a0->field_18 | 0x800;
        sub_a36c8c();
        v3->field_c8();
    }
    return 0xffffffff;
}
