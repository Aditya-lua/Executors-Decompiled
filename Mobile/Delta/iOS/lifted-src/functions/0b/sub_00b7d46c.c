/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7d46c..0xb7d588 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7d46c_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_b7d46c_0;


int sub_b7d46c(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    st_b7d46c_0 *v5;  // x8
    unsigned long long *v6;  // x0
    char v7;  // x9
    char v8;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[2];
    v3 = 2;
    v4 = 3;
    if ((unsigned int)a1 >= 0x10000)
        v4 = 4;
    if ((unsigned int)a1 < 0x800)
        v4 = v3;
    if (128 > (unsigned int)a1)
        v4 = 1;
    if (*a0 - v2 >= v4)
    {
        v5 = a0[1] + v2;
        v6 = a0;
        if (128 <= (unsigned int)a1)
            goto LABEL_b7d500;
LABEL_b7d4c0:
        v5->field_0 = a1;
        v6 = a0;
    }
    else
    {
        sub_c6c0cc();
        v6 = a0;
        v5 = a0[1] + a0[2];
        if ((unsigned int)a1 < 128)
            goto LABEL_b7d4c0;
LABEL_b7d500:
        v7 = 128 | (128 | (char)a1 & 63) & 63;
        if (0x800 > (unsigned int)a1)
        {
            v5->field_0 = (char)((unsigned int)a1 >> 6) | 192;
            v5->field_1 = v7;
        }
        else
        {
            v8 = 128 | (128 | (char)(__ROL__((unsigned int)a1, 26)) & 63) & 63;
            if ((unsigned int)a1 <= 0xffff)
            {
                v5->field_0 = (char)((unsigned int)a1 >> 12) | 224;
                v5->field_1 = v8;
                v5->field_2 = v7;
            }
            else
            {
                v5->field_0 = (char)((unsigned int)a1 >> 18) | 240;
                v5->field_1 = 128 | (128 | (char)(__ROL__((unsigned int)a1, 20)) & 63) & 63;
                v5->field_2 = v8;
                v5->field_3 = v7;
            }
        }
    }
    v6[2] = v4 + v2;
    return 0;
}
