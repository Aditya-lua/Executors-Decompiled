/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55a28..0xa55b2c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55a28_0 {
    char padding_0[16];
    unsigned long long field_10;
    struct st_a55a28_1 *field_18;
    char padding_20[112];
    struct st_a55a28_1 *field_90;
} st_a55a28_0;

typedef struct st_a55a28_1 {
    unsigned long long field_0;
} st_a55a28_1;

extern unsigned long long g_c7c2eb;

unsigned long long * sub_a55a28(st_a55a28_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long *v4;  // x23
    unsigned long v0;  // [bp-0x50]
    unsigned long long *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0->field_18)
        v4 = &g_c7c2eb;
    else
        v4 = a0->field_18;
    if (!a0->field_90)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/keymgmt_meth.c", 450, "evp_keymgmt_gen");
        v0 = a0->field_10;
        v1 = v4;
        sub_a36abc(6, 236, "%s key generation:%s");
        return 0;
    }
    sub_a36c8c();
    a0->field_90();
}
