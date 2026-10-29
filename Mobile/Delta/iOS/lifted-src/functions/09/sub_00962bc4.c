/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962bc4..0x962c80 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962bc4_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[1032];
    unsigned long long field_418;
    unsigned long long field_420;
} st_962bc4_0;


unsigned long long sub_962bc4(st_962bc4_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x21
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a1;
    v4 = sub_980da4();
    if (a0->field_8 != v4 && (v5 = sub_980db0(), a0->field_8 != sub_980db0()))
    {
        v6 = sub_980dbc();
        if ((v2 | v3) < 2 || a0->field_8 != v6)
            goto LABEL_962c2c;
    }
    else if (1 >= (v2 | v3))
    {
LABEL_962c2c:
        if (v3 == 1)
        {
            v3 = 0;
LABEL_962c44:
            a0->field_418 = v3;
            if (v2 == 1)
            {
                a0->field_420 = 0;
                return 1;
            }
            if (0x4000 >= v2)
            {
                a0->field_420 = v2;
                return 1;
            }
        }
        else if (!(0x4000 < v3))
        {
            goto LABEL_962c44;
        }
    }
    return 0;
}
