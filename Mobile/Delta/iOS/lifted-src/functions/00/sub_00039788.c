/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39788..0x39a5c (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39788_1 {
    long long field_0;
    char padding_8[96];
    char field_68;
    char padding_69[119];
    char field_e0;
    char padding_e1[79];
    char field_130;
    char padding_131[1227];
    unsigned int field_5fc;
    char padding_600[41];
    char field_629;
    char padding_62a[126];
    struct st_39788_2 *field_6a8;
    struct st_39788_2 *field_6b0;
} st_39788_1;

typedef struct st_39788_2 {
    long long field_0;
} st_39788_2;

typedef struct st_39788_0 {
    char field_0;
} st_39788_0;


unsigned long long sub_39788(st_39788_1 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v9;  // x0
    unsigned long long v10;  // x25
    unsigned long iter;  // x26
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // w8
    unsigned long long v15;  // x22
    unsigned long long v16;  // x23
    unsigned long long v17;  // x0
    long long *v18;  // x20
    unsigned long long v0;  // [bp-0x90]
    st_39788_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_39788_0 *v2;  // [bp-0x80]
    unsigned int v3;  // [bp-0x78], Other Possible Types: unsigned long long
    char v4;  // [bp-0x74]
    unsigned long v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v2 = &v1;
    v1 = &v2;
    v6 = a1;
    v9 = sub_3b040(&a0->field_68, &v6);
    if (!v9)
        v10 = 0;
    else
        v10 = v9 + 8;
    if (!(sub_31b78() >> 31 & 1))
    {
        sub_c84c(&a0->field_6a8, a0->field_6a8);
        sub_16d50(&a0->field_6a8, *(long long *)(v10 + 16) - *(long long *)(v10 + 8) >> 3);
        iter = *(long long *)(v10 + 8);
        if (*(long long *)(v10 + 8) != *(long long *)(v10 + 16))
        {
            do
            {
                v5 = *(long long *)iter;
                v12 = sub_46ddc(a0, *(long long *)iter);
                if (!(v12 >> 31 & 1))
                {
                    v13 = sub_34930(&a0->field_e0, &v5);
                    if (v13)
                        v14 = *(char *)(v13 + 16);
                    else
                        v14 = 0;
                    v3 = v14;
                    v4 = v12;
                    sub_f2b8(&a0->field_6a8, &v3);
                }
                else
                {
                    v15 = sub_3a7e0(&a0->field_130, &v5);
                    if (v15 && *(int *)(v15 + 8))
                    {
                        v16 = sub_3b87c(a0, v6, 1);
                        sub_437a8(a0, v6, v15 + 8, v16);
                        v3 = 0;
                        v4 = v16;
                        sub_f2b8(&a0->field_6a8, &v3);
                    }
                    else
                    {
                        v3 = 2;
                        v4 = sub_47cd4(a0, v5);
                        sub_f2b8(&a0->field_6a8, &v3);
                    }
                }
            } while ((iter += 8, iter != *(long long *)(v10 + 16)));
        }
        if (*(int *)&a0->padding_8[0] <= 0 || !sub_44a98(a0, v6) || a0->field_629 & 1 || 0x8000 <= sub_2b13c(a0->field_0, *(int *)v10))
        {
            v0 = a0->field_6b0 - a0->field_6a8 >> 3;
            sub_300cc(a0->field_0, "allocation: closure with %d upvalues");
        }
        v17 = sub_2fdb0(a0->field_0);
        v18 = a0->field_6a8;
        if (a0->field_6a8 != a0->field_6b0)
        {
            do
            {
            } while ((v17 = sub_2ad10(), v18 += 1, v18 != a0->field_6b0));
        }
        a0->field_5fc = a0->field_5fc;
        return v17;
    }
    sub_45808(v6 + 12, "Exceeded closure limit; simplify the code to compile");
    __debugbreak();
}
