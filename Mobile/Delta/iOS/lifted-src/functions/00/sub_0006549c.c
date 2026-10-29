/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6549c..0x65528 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6549c_0 {
    unsigned long long field_0;
    char padding_8[56];
    unsigned long long field_40;
    char padding_48[32];
    unsigned long long field_68;
    char padding_70[288];
    char field_190;
    char field_191;
} st_6549c_0;

extern unsigned long long g_e69ff0;
extern char g_10001c8;

st_6549c_0 * sub_6549c(st_6549c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = &g_e69ff0;
    sub_64448();
    if (a0->field_190 == 1 && a0->field_40)
        operatordelete[](a0->field_40);
    if (a0->field_191 == 1 && a0->field_68)
        operatordelete[](a0->field_68);
    a0->field_0 = &g_10001c8;
    return a0;
}
