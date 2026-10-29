/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55908..0xb55af4 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b55908_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b55908_0;


st_b55908_0 * sub_b55908(long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_b55908_0 *v7;  // x20
    st_b55908_0 *v8;  // x19
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x24
    unsigned long v13;  // x1
    unsigned long long v14;  // x2
    unsigned long long v15;  // x0
    long long v16;  // x1
    unsigned int v0;  // [bp-0x68]
    st_b55908_0 *v1;  // [bp-0x64]
    char v2;  // [bp-0x60]
    char v3;  // [bp-0x5c]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = sub_afd760(*a0);
    v0 = 0xffffffff;
    v1 = 0xffffffff;
    if (!v7)
    {
        sub_9d3c28(v7);
        sub_9ebcf4(0);
        return 0;
    }
    v8 = sub_9ebce0();
    if (v8 && sub_9ebd68(v8, 16))
    {
        sub_a36c8c();
        v9 = sub_9d3d84(v7, v8->field_8, 16);
        sub_a36cd4(v9, v8->field_8, 16);
        if ((unsigned int)v9 == 16)
        {
            sub_a36c8c();
            v4 = v8->field_8;
            v10 = sub_a9e490(&v4, 16, &v2, &v3, &v1, &v0);
            sub_a36cd4(v10, 16, &v2, &v3, &v1, &v0);
            if ((int)v10 < 1 || (v11 = sub_a9e750(v3, v1, v0), (unsigned int)v11 > 0x19000))
                goto LABEL_b559d4;
            v12 = v11;
            if (!sub_9ebd68(v8, (unsigned int)v11 + 16))
            {
                sub_a368c8();
                v16 = 199;
LABEL_b55a40:
                sub_a369bc("providers/implementations/storemgmt/file_store_any2obj.c", v16, "msblob2obj_decode");
                sub_a36abc(9, 0x80007, 0);
                sub_9d3c28(v7);
                sub_9ebcf4(v8);
                return 0;
            }
            sub_a36c8c();
            v13 = v8->field_8 + 16;
            v14 = v12;
            v15 = sub_9d3d84(v7, v13, v14);
            sub_a36cd4(v15, v13, v14);
            sub_9d3c28(v7);
            if ((unsigned int)v15 == (unsigned int)v12)
                goto LABEL_b559e8;
        }
        else
        {
LABEL_b559d4:
            sub_9d3c28(v7);
        }
        sub_9ebcf4(v8);
LABEL_b559e8:
        return sub_b5575c();
    }
    sub_a368c8();
    v16 = 174;
    goto LABEL_b55a40;
}
