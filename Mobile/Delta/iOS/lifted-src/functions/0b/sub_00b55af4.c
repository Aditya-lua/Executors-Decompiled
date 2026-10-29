/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55af4..0xb55cd4 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b55af4_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b55af4_0;


st_b55af4_0 * sub_b55af4(long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_b55af4_0 *v6;  // x20
    st_b55af4_0 *v7;  // x19
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x24
    unsigned long v11;  // x1
    unsigned long long v12;  // x2
    unsigned long long v13;  // x0
    long long v14;  // x1
    st_b55af4_0 *v0;  // [bp-0x64]
    char v1;  // [bp-0x60], Other Possible Types: unsigned int
    char v2;  // [bp-0x5c], Other Possible Types: unsigned int
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_afd760(*a0);
    v0 = 0xffffffff;
    if (!v6)
    {
        sub_9d3c28(v6);
        sub_9ebcf4(0);
        return 0;
    }
    v7 = sub_9ebce0();
    if (v7 && sub_9ebd68(v7, 24))
    {
        sub_a36c8c();
        v8 = sub_9d3d84(v6, v7->field_8, 24);
        sub_a36cd4(v8, v7->field_8, 24);
        if ((unsigned int)v8 == 24)
        {
            sub_a36c8c();
            v3 = v7->field_8;
            v9 = sub_a9eed0(&v3, 24, 0, &v0, &v2, &v1);
            sub_a36cd4(v9, 24, 0, &v0, &v2, &v1);
            if ((int)v9 < 1)
                goto LABEL_b55c64;
            v10 = v1 + v2;
            if (!sub_9ebd68(v7, v10 + 24))
            {
                sub_a368c8();
                v14 = 267;
LABEL_b55c2c:
                sub_a369bc("providers/implementations/storemgmt/file_store_any2obj.c", v14, "pvk2obj_decode");
                sub_a36abc(9, 0x80007, 0);
                sub_9d3c28(v6);
                sub_9ebcf4(v7);
                return 0;
            }
            sub_a36c8c();
            v11 = v7->field_8 + 24;
            v12 = v10;
            v13 = sub_9d3d84(v6, v11, v12);
            sub_a36cd4(v13, v11, v12);
            sub_9d3c28(v6);
            if ((unsigned int)v13 != (unsigned int)v10)
                goto LABEL_b55c6c;
        }
        else
        {
LABEL_b55c64:
            sub_9d3c28(v6);
LABEL_b55c6c:
            sub_9ebcf4(v7);
        }
        return sub_b5575c(a0, 2, "pvk");
    }
    sub_a368c8();
    v14 = 246;
    goto LABEL_b55c2c;
}
