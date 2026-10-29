/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x749a8..0x74ccc (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_749a8_2 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    unsigned long long field_10;
} st_749a8_2;

typedef struct st_749a8_3 {
    char padding_0[280];
    unsigned long long field_118;
} st_749a8_3;

typedef struct st_749a8_1 {
    char padding_0[25];
    char field_19;
    char padding_1a[62];
    unsigned long long field_58;
    unsigned long long field_60;
    char padding_68[8];
    char field_70;
    char padding_71[95];
    long long field_d0;
    char field_d8;
    char padding_d9[63];
    char field_118;
    char padding_119[215];
    long long field_1f0;
} st_749a8_1;

typedef struct st_749a8_0 {
    char field_0;
} st_749a8_0;


unsigned long long sub_749a8(st_749a8_1 *a0, long long a1, unsigned long long *a2, unsigned long long a3, unsigned long a4)
{
    unsigned long long v14;  // x0
    unsigned long long v15;  // x23
    unsigned long long v23;  // x21
    unsigned long v24;  // x28
    unsigned long v25;  // x26
    unsigned long long v26;  // w23
    unsigned long v27;  // x8
    unsigned long long v29;  // x0
    st_749a8_3 *v30;  // x28
    st_749a8_2 *v31;  // x8
    unsigned long long v16;  // x0
    unsigned long v17;  // x26
    unsigned long long *v18;  // x28
    unsigned long long v19;  // x27
    unsigned long long v20;  // w0
    unsigned long v21;  // x8
    unsigned long long v0;  // [bp-0xb8]
    unsigned long long *v1;  // [bp-0xb0]
    unsigned long long v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0xa0]
    st_749a8_0 **v4;  // [bp-0x98], Other Possible Types: char
    st_749a8_0 *v5;  // [bp-0x90]
    unsigned long v6;  // [bp-0x88]
    unsigned long v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x78]
    unsigned long v9;  // [bp-0x70]
    unsigned long long v10;  // [bp-0x68], Other Possible Types: unsigned int
    unsigned int v11;  // [bp-0x64], Other Possible Types: unsigned long long
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v5 = &v4;
    v4 = &v5;
    if (sub_740a4(&a0->field_118, 5) != 3)
    {
        v14 = sub_740a4(&a0->field_118, 5);
        if ((unsigned int)v14)
        {
            *(unsigned short *)&v31->field_0 = 0;
            v31->field_8 = 0;
            v31->field_10 = 0;
            return v14;
        }
    }
    v15 = a2[1];
    if ((unsigned int)a3)
    {
        v14 = sub_715d0(a0->field_1f0, a2, &a0[1].padding_1a[6]);
        if (!(v14 & 1))
        {
            *(unsigned short *)&v31->field_0 = 0x100;
            v31->field_8 = 0;
            v31->field_10 = 0;
            return v14;
        }
        v16 = sub_6b08(&a0[1].padding_1a[6]);
        v17 = sub_a0c8(&a0[1].padding_1a[6]);
        v3 = v17 + sub_6b08(&a0[1].padding_1a[6]);
    }
    else
    {
        v17 = *a2;
        v3 = *a2 + v15;
        v16 = v15;
    }
    v18 = &a0->field_70;
    std::__1::mutex::lock(v18);
    sub_73058(&a0->field_58, v16);
    std::__1::mutex::unlock(v18);
    v0 = v16;
    v1 = v18;
    v19 = v16 >> 15;
    v2 = v15;
    if (!v19)
    {
        v8 = v3;
        v9 = v17;
        v20 = (unsigned int)sub_7392c(a0, a1, 1, &v9, &v8, a3);
        if (*(long long *)(a4 + 24))
        {
            v11 = 0;
            v10 = 1;
            sub_664e4(a4, &v11, &v10);
        }
    }
    else
    {
        v21 = v17 + 0x8000;
        if (v19 == 1)
            v21 = v3;
        v6 = v21;
        v7 = v17;
        v14 = sub_7392c();
        if (!(unsigned int)v14)
        {
            *(unsigned short *)&v31->field_0 = 0;
            v31->field_8 = 0;
            v31->field_10 = 0;
            return v14;
        }
        if (*(long long *)(a4 + 24))
        {
            v11 = 0;
            v10 = v19;
            v20 = 1;
            if (v19 == 1 || !(sub_664e4(a4, &v11, &v10) & 1))
                goto LABEL_74ae8;
        }
        else if (!(v19 != 1))
        {
            goto LABEL_74bec;
        }
        v23 = v19 - 2;
        v24 = v17 + 0x10000;
        v25 = v17 + 0x8000;
        v26 = 1;
        while (1)
        {
            if (!v23)
                v27 = v3;
            else
                v27 = v24;
            v6 = v27;
            v7 = v25;
            v14 = sub_7392c();
            if (!(v14 & 1))
            {
                *(unsigned short *)&v31->field_0 = 0;
                v31->field_8 = 0;
                v31->field_10 = 0;
                return v14;
            }
            if (!*(long long *)(a4 + 24))
            {
                if (v23)
                    goto LABEL_74c0c;
LABEL_74bec:
                v20 = 1;
                break;
            }
            else
            {
                v11 = v26;
                v10 = v19;
                v20 = 1;
                if (!v23 || !(sub_664e4(a4, &v11, &v10) & 1))
                    break;
LABEL_74c0c:
                v23 -= 1;
                v26 += 1;
                v24 += 0x8000;
                v25 += 0x8000;
            }
        }
    }
LABEL_74ae8:
    std::__1::mutex::lock(v1);
    v29 = std::__1::mutex::unlock(v1);
    if (a0->field_58 != a0->field_60)
    {
        v30 = &a0->field_d8;
        std::__1::mutex::lock(v30);
        sub_66100(a0->field_d0, 1);
        std::__1::mutex::unlock(v30);
        v29 = sub_60768(&a0->field_19, 5);
        if ((unsigned int)v29)
        {
            v29 = sub_73c30(a0);
            v20 &= (unsigned int)v29;
        }
    }
    v31->field_0 = v20;
    v31->padding_1[0] = 0;
    v31->field_8 = v2;
    v31->field_10 = v0;
    return v29;
}
