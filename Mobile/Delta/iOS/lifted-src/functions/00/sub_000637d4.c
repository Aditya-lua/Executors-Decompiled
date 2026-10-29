/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x637d4..0x63860 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_637d4_0 {
    unsigned long long *field_0;
    unsigned long long field_8;
    char padding_10[96];
    unsigned long long field_70;
} st_637d4_0;

extern unsigned long long g_e69c70;
extern unsigned long long g_e69f28;
extern char g_e69f50;
extern char g_10001c8;

void sub_637d4(st_637d4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_637d4_0 *v8;  // x19
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
    v8->field_70 = &g_e69f50;
    v8->field_0 = &g_e69f28;
    v8->field_8 = &g_e69c70;
    v8->field_8 = &g_10001c8;
}
