/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc422f8..0xc425c4 (716 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c422f8_2 {
    char padding_0[8];
    struct st_c422f8_0 *field_8;
} st_c422f8_2;

typedef struct st_c422f8_0 {
    char padding_0[24];
    struct st_c422f8_1 *field_18;
} st_c422f8_0;

typedef struct st_c422f8_1 {
    unsigned long long field_0;
} st_c422f8_1;


void sub_c422f8(char *a0, st_c422f8_2 *a1)
{
    unsigned long long v21;  // x28
    unsigned long long v22;  // x27
    long long ptr;  // x20
    long long v32;  // x21
    unsigned long v33;  // x9
    uint128_t *v34;  // x22
    long long v35;  // x22
    long long ptr1;  // x0
    unsigned long v37;  // x20
    long long v38;  // x0
    unsigned long long v23;  // x24
    unsigned long long v24;  // x23
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    long long v27;  // x20
    unsigned long long v28;  // x19
    unsigned long long v29;  // x30
    long long ptr2;  // x0
    char v0;  // [bp-0x111]
    uint128_t v1;  // [bp-0x110]
    unsigned long v2;  // [bp-0x100]
    uint128_t v3;  // [bp-0xf8]
    char v4;  // [bp-0xe8]
    uint128_t v5;  // [bp-0xe0], Other Possible Types: unsigned long long
    unsigned long v6;  // [bp-0xd8]
    long long v7;  // [bp-0xd0]
    uint128_t v8;  // [bp-0x98]
    long long len;  // [bp-0x88]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    char *v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = v26;
    v16 = v27;
    v17 = v28;
    v18 = &v20;
    v19 = v29;
    v0 = *a0;
    ptr2 = _malloc(0x200);
    if (!ptr2)
    {
        v38 = sub_c6b970(1, 0x200);
        _free(v27);
        __Unwind_Resume(v38);
    }
    ptr = ptr2;
    v32 = 0x200;
    v8 = CONCAT(ptr2, 0x200);
    if (!_getcwd())
    {
        do
        {
            v33 = *(int *)___error();
            v2 = 2 | v33 * 0x100000000;
            if ((unsigned int)v33 != 0x22)
            {
                v34 = &v5 | 8;
                v5 = 0x8000000000000000;
                v6 = v2;
                if (v32)
                {
                    _free(ptr);
                    goto LABEL_c4243c;
                }
            }
            sub_c40ff0(&v2);
            len = v32;
            sub_c6c0cc(&v8, v32, 1, 1, 1);
            v32 = *(unsigned long long *)&v8;
            ptr = *(unsigned long long *)((void*)&v8 + 8);
        } while (!_getcwd(ptr, v32));
    }
    len = _strlen(ptr);
    if ((unsigned long long)v32 > (unsigned long long)len)
    {
        v35 = len;
        if (len)
        {
            ptr1 = _realloc(ptr, v35);
            if (!ptr1)
            {
                sub_c6b970(1, v35);
                __debugbreak();
            }
        }
        else
        {
            _free(ptr);
            ptr1 = 1;
        }
        v8 = CONCAT(ptr1, v35);
    }
    v5 = v8;
    v7 = len;
    v37 = *(unsigned long long *)&v5;
    v34 = &v5 | 8;
    if (v37 == 0x8000000000000000)
    {
LABEL_c4243c:
        sub_c40ff0(v34);
        v37 = 0x8000000000000000;
    }
    else
    {
        v1 = *v34;
    }
    v4 = *a0;
    v2 = v37;
    v3 = v1;
    a1->field_8->field_18();
}
