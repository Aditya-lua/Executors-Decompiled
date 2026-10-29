/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9f60..0xada010 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9f60_0 {
    char padding_0[8];
    long long field_8;
} st_ad9f60_0;


unsigned int sub_ad9f60(st_ad9f60_0 *a0, unsigned long long a1)
{
    unsigned int *v2;  // x0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a1 >> 31 & 1))
    {
        if ((int)sub_ad69e4(a0->field_8) > (int)a1)
        {
            v2 = sub_ad69f8(a0->field_8, a1);
            if (1 >= *v2 - 1)
                return v2[8];
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ui/ui_lib.c", 456, "UI_get_result_length");
            v3 = 0x66;
LABEL_ad9ff8:
            sub_a36abc(40, v3, 0);
        }
        return 0xffffffff;
    }
    sub_a368c8();
    sub_a369bc("crypto/ui/ui_lib.c", 452, "UI_get_result_length");
    v3 = 103;
    goto LABEL_ad9ff8;
}
