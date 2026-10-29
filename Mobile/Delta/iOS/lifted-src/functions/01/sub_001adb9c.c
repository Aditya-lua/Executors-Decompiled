/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1adb9c..0x1adc88 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1adb9c_1 {
    char padding_0[128];
    long long field_80;
} st_1adb9c_1;

typedef struct st_1adb9c_2 {
    char padding_0[152];
    long long field_98;
} st_1adb9c_2;

typedef struct st_1adb9c_0 {
    char padding_0[48];
    char field_30;
    char padding_31[7];
    long long field_38;
    char padding_40[8];
    char field_48;
    char padding_49[15];
    long long field_58;
    char padding_60[152];
    char field_f8;
    char padding_f9[7];
    long long field_100;
    char padding_108[8];
    char field_110;
    char padding_111[23];
    char field_128;
    char padding_129[111];
    char field_198;
    char padding_199[15];
    long long field_1a8;
} st_1adb9c_0;


st_1adb9c_0 * sub_1adb9c(st_1adb9c_0 *a0)
{
    st_1adb9c_1 *v0;  // [bp-0x28], Other Possible Types: st_1adb9c_2 *
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_181a8(&a0[1].padding_60[72]);
    sub_181a8(&a0[1].padding_60[16]);
    sub_181a8(&a0[1].padding_49[7]);
    sub_181a8(&a0[1].field_30);
    sub_181a8(&a0[1].padding_0[16]);
    sub_1a42cc(&a0->field_198, a0->field_1a8);
    sub_2219c(&a0->field_198, 0);
    v0 = &a0->field_128;
    sub_127c0(&v0);
    v0 = &a0->field_110;
    sub_14fdc(&v0);
    sub_1be100(&a0->field_f8, a0->field_100);
    sub_1a42cc(&a0->field_48, a0->field_58);
    sub_2219c(&a0->field_48, 0);
    sub_62aa0(&a0->field_30, a0->field_38);
    return a0;
}
