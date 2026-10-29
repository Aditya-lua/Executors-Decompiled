/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a854..0x1ab7c (808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a854_2 {
    char padding_0[8];
    struct st_1a854_1 *field_8;
    struct st_1a854_1 *field_10;
} st_1a854_2;

typedef struct st_1a854_3 {
    char padding_0[8];
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    struct st_1a854_2 *field_20;
} st_1a854_3;

typedef struct st_1a854_4 {
    struct st_1a854_3 *field_0;
} st_1a854_4;

typedef struct st_1a854_0 {
    char field_0;
} st_1a854_0;

typedef struct st_1a854_1 {
    char padding_0[8];
    unsigned int field_8;
} st_1a854_1;

extern unsigned int g_f00b30;
extern unsigned int g_f00bb0;
extern char g_10002b0;

char * sub_1a854(char *a0, unsigned long long a1, st_1a854_4 **a2)
{
    unsigned long ptr;  // x8
    long long v16;  // x0
    long long v17;  // x0
    long long v18;  // x0
    long long v19;  // x0
    st_1a854_3 **v11;  // x8
    st_1a854_3 *v12;  // x8
    st_1a854_1 **iter;  // x25
    unsigned long long v14;  // x26
    unsigned long long v15;  // x26
    unsigned long long v0;  // [bp-0xc0]
    st_1a854_0 **v1;  // [bp-0xb8], Other Possible Types: char
    st_1a854_0 *v2;  // [bp-0xb0]
    char v3;  // [bp-0xa8]
    char *v4;  // [bp-0x90], Other Possible Types: uint128_t, unsigned long
    unsigned long long v5;  // [bp-0x88]
    char v6;  // [bp-0x80]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    if (a2[1] == 1)
    {
        v11 = *a2;
        if (*v11->field_8 == g_f00bb0)
        {
            memset(ptr, 0, 24);
            v12 = *v11;
            if (v12->field_20)
            {
                iter = *(long long *)v12->padding_1c + 16;
                v14 = v12->field_20 * 24;
                while (1)
                {
                    v15 = v14;
                    if (*(int *)((char *)iter - 16) != 1)
                    {
                        a0 = sub_2359c(ptr, *iter + 1, "Only constants keys 'use' and 'reason' are allowed for @deprecated attribute");
                        iter += 3;
                        v14 = v15 - 24;
                        if (v15 == 24)
                            break;
                        else
                            continue;
                    }
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init();
                    if (sub_9fd8(&v4, "use") & 1 || sub_9fd8(&v4, "reason") & 1)
                    {
                        if (*iter->field_8 == g_f00b30)
                            goto LABEL_1aa10;
                        v0 = sub_a0c8(&v4);
                        sub_31fc4("Only constant string allowed as value for '%s'");
                        sub_1ec3c(ptr, *iter + 1, &v3);
                    }
                    else
                    {
                        v0 = sub_a0c8(&v4);
                        sub_31fc4("Unknown argument '%s' for @deprecated. Only string constants for 'use' and 'reason' are allowed");
                        sub_1ec3c(ptr, *(long long *)((char *)iter - 8) + 12, &v3);
                    }
LABEL_1aa10:
                    a0 = &v4;
                    iter += 3;
                    v14 = v15 - 24;
                    if (v15 == 24)
                        break;
                }
            }
        }
        else
        {
            v4 = *(int128_t *)&(&*v11->field_8)[1];
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v6, "Unknown argument type for @deprecated", 37);
            memset(ptr, 0, 24);
            sub_12fe8(ptr, &v4, &v7, 1);
LABEL_1aaa0:
            a0 = &v6;
        }
    }
    else if (!a2[1])
    {
        memset(ptr, 0, 24);
    }
    else
    {
        v4 = a0;
        v5 = a1;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v6, "@deprecated can be parametrized only by 1 argument", 50);
        memset(ptr, 0, 24);
        sub_12fe8(ptr, &v4, &v7, 1);
        goto LABEL_1aaa0;
    }
    if (*(long long *)&g_10002b0 == v7)
        return a0;
    v16 = __Unwind_Resume(___stack_chk_fail());
    v17 = __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(v16)));
    v4 = ptr;
    sub_1d5cc(&v4);
    v18 = __Unwind_Resume(v17);
    v4 = ptr;
    sub_1d5cc(&v4);
    v19 = __Unwind_Resume(v18);
    v4 = ptr;
    sub_1d5cc(&v4);
    __Unwind_Resume(v19);
}
