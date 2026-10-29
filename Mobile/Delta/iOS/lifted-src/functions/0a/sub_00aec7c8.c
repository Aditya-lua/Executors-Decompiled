/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaec7c8..0xaec95c (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aec7c8_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_aec7c8_0;


long long sub_aec7c8(unsigned long a0, unsigned long a1, unsigned long a2, st_aec7c8_0 *a3, unsigned long a4)
{
    unsigned long v3;  // x23
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a3->field_10)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_san.c", 604, "v2i_GENERAL_NAME_ex");
        sub_a36abc(0x22, 124, 0);
        return 0;
    }
    v3 = a3->field_8;
    if (sub_aefce4(v3, "email") && sub_aefce4(v3, "URI") && sub_aefce4(v3, "DNS") && sub_aefce4(v3, "RID") && sub_aefce4(v3, "IP") && sub_aefce4(v3, "dirName") && sub_aefce4(v3, "otherName"))
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_san.c", 623, "v2i_GENERAL_NAME_ex");
        v0 = v3;
        sub_a36abc(0x22, 117, "name=%s");
        return 0;
    }
}
