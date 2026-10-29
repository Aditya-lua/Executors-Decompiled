/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99cc60..0x99cd9c (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99cc60_1 {
    char padding_0[28];
    char field_1c;
    char padding_1d[3];
    char field_20;
    char padding_21[11];
    int field_2c;
} st_99cc60_1;

typedef struct st_99cc60_0 {
    char padding_0[72];
    unsigned int field_48;
} st_99cc60_0;


char sub_99cc60(st_99cc60_0 *a0, long long a1, long long a2)
{
    long long v4;  // x22
    char v5;  // w0
    char v6;  // x24
    st_99cc60_1 *v7;  // x0
    char v8;  // x23
    unsigned long v9;  // x22
    char v0;  // [bp-0x60]
    char v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (a0->field_48 == 0x300)
        return 0;
    v4 = sub_9612bc();
    v5 = sub_ad69e4(v4);
    if (v5 >= 1)
    {
        v6 = 0;
        do
        {
            v7 = sub_ad69f8(v4, v6);
            if (v7->field_1c & 132 || v7->field_20 >> 3 & 1 || 772 <= v7->field_2c)
            {
                sub_ad6020(v4);
                sub_967f90(a0, &v1, &v0);
                if (v0)
                {
                    v8 = 0;
                    do
                    {
                        v9 = *(short *)(v1 + v8 * 2);
                        if (sub_968084(a0, v9, a1, a2, 1, 0) && sub_968218(a0, v9, 0x20004))
                            return 1;
                    } while ((v8 += 1, v0 > v8));
                }
            }
        } while ((v6 += 1, v5 != v6));
    }
    sub_ad6020(v4);
    return 0;
}
