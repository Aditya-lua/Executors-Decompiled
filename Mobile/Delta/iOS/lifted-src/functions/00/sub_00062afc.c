/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62afc..0x62b88 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62afc_0 {
    unsigned long long *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[96];
    unsigned long long field_80;
} st_62afc_0;

extern unsigned long long g_e69a98;
extern char g_e69ac0;
extern char g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

void sub_62afc(st_62afc_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_62afc_0 *v8;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = (char *)a0 + *(long long *)((char *)a0->field_0 - 24);
    v8->field_0 = &g_e69a98;
    v8->field_80 = &g_e69ae8;
    v8->field_10 = &g_e69ac0;
    v8->field_18 = &g_e69c70;
    v8->field_18 = &g_10001c8;
}
