/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x999e08..0x999e84 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_999e08_0 {
    char padding_0[28];
    unsigned int field_1c;
    char padding_20[96];
    unsigned long long field_80;
    char padding_88[1544];
    unsigned long long field_690;
    unsigned long long field_698;
    char padding_6a0[32];
    unsigned long long field_6c0;
    char padding_6c8[2312];
    unsigned long long field_fd0;
    unsigned long long field_fd8;
} st_999e08_0;


unsigned int sub_999e08(st_999e08_0 *a0)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_1c == 1 && a0->field_690 >= a0->field_698)
    {
        v2 = sub_997034();
        if (!v2)
            return v2;
        a0->field_80 = 0;
    }
    return 1;
}
