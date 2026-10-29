/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb64c44..0xb64c8c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b64c44_0 {
    char padding_0[104];
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned int field_78;
    unsigned int field_7c;
} st_b64c44_0;

extern char g_e05696;
extern char g_e05e96;

st_b64c44_0 * sub_b64c44(st_b64c44_0 *a0)
{
    a0->field_68 = &g_e05696;
    a0->field_78 = 9;
    a0->field_70 = &g_e05e96;
    a0->field_7c = 5;
    return a0;
}
