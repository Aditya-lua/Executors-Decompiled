/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971e78..0x971f84 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971e78_0 {
    char padding_0[4];
    char field_4;
    char field_5;
    char padding_6[10];
    char field_10;
    char padding_11[55];
    unsigned long long field_48;
    unsigned int field_50;
} st_971e78_0;


unsigned long long sub_971e78(st_971e78_0 *a0, unsigned int a1, long long a2)
{
    unsigned long v2;  // x8
    unsigned int v3;  // x9
    unsigned int v4;  // x10
    unsigned int v5;  // x0
    unsigned int v6;  // x0
    unsigned int v7;  // w9
    char v8;  // x9
    unsigned int v9;  // w8
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_972498())
    {
        v2 = a0->field_48;
        v3 = *(long long *)&a0->field_50;
        if (v2 >= v3)
        {
            v4 = v3 * 2;
            if (!v3)
                v4 = 16;
            if (v4 > v3)
            {
                if (16 >= v4)
                {
                    v5 = (unsigned int)(struct st_971e78_0 *)a0->padding_11;
                }
                else
                {
                    v6 = *(long long *)&a0->padding_6[2];
                    if (v6 == a0->padding_11)
                    {
                        v6 = 0;
                        *(unsigned long long *)&a0->padding_6[2] = 0;
                    }
                    v5 = sub_a6c1b4(v6, v4, "ssl/quic/json_enc.c", 129);
                    if (!v5)
                        goto LABEL_971f58;
                    v2 = a0->field_48;
                }
                *(unsigned long long *)&a0->padding_6[2] = v5;
            }
            *(unsigned long long *)&a0->field_50 = v4;
        }
        v7 = 1 << (a0->field_5 & 31);
        if (!a1)
            v8 = *(char *)(*(long long *)&a0->padding_6[2] + v2) & (char)~v7;
        else
            v8 = *(char *)(*(long long *)&a0->padding_6[2] + v2) | (char)v7;
        *(char *)(*(long long *)&a0->padding_6[2] + v2) = v8;
        v9 = a0->field_5 + 1;
        a0->field_5 = (char)v9 & 7;
        if (!(v9 & 7))
            a0->field_48 = a0->field_48 + 1;
    }
    else
    {
LABEL_971f58:
        a0->field_4 = 1;
    }
    v10 = sub_9721c8(a0, a2);
    a0->field_10 = 1;
    return v10;
}
