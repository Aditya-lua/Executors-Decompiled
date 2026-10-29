/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x47694..0x47cd4 (1600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_47694_3 {
    struct st_47694_2 *field_0;
    char padding_8[8];
    struct st_47694_4 *field_10;
    struct st_47694_4 *field_18;
} st_47694_3;

typedef struct st_47694_4 {
    unsigned int field_0;
} st_47694_4;

typedef struct st_47694_1 {
    unsigned long long field_0;
} st_47694_1;

typedef struct st_47694_2 {
    struct st_47694_1 *field_0;
} st_47694_2;

typedef struct st_47694_0 {
    char field_0;
} st_47694_0;

extern unsigned long long g_e64bc8;
extern char g_10002b0;

void sub_47694(unsigned long a0, st_47694_3 *a1, unsigned long a2, uint128_t *a3)
{
    unsigned long long v32;  // x28
    unsigned long long v33;  // x27
    unsigned long long v42;  // x30
    unsigned int *v43;  // x24
    int v44;  // w0
    int v45;  // w8
    unsigned long long v34;  // x26
    unsigned long long v35;  // x25
    unsigned long long v36;  // x24
    unsigned long long v37;  // x23
    unsigned long long v38;  // x22
    unsigned long long v39;  // x21
    unsigned long long v40;  // x20
    unsigned long long v41;  // x19
    st_47694_0 **v0;  // [bp-0x9b8], Other Possible Types: char
    st_47694_0 *v1;  // [bp-0x9b0]
    st_47694_0 **v2;  // [bp-0x9a8], Other Possible Types: char
    st_47694_0 *v3;  // [bp-0x938]
    unsigned long long v4;  // [bp-0x878]
    char *v5;  // [bp-0x870]
    unsigned short v6;  // [bp-0x868]
    unsigned long v7;  // [bp-0x860]
    unsigned long v8;  // [bp-0x858]
    unsigned long v9;  // [bp-0x850]
    char v10;  // [bp-0x841]
    uint128_t v11;  // [bp-0x840], Other Possible Types: int, unsigned int
    unsigned int v12;  // [bp-0x838]
    uint128_t v13;  // [bp-0x830]
    uint128_t v14;  // [bp-0x820]
    uint128_t v15;  // [bp-0x810]
    uint128_t v16;  // [bp-0x800]
    uint128_t v17;  // [bp-0x7f0]
    unsigned long v18;  // [bp-0x68]
    unsigned long long v19;  // [bp-0x60]
    unsigned long long v20;  // [bp-0x58]
    unsigned long long v21;  // [bp-0x50]
    unsigned long long v22;  // [bp-0x48]
    unsigned long long v23;  // [bp-0x40]
    unsigned long long v24;  // [bp-0x38]
    unsigned long long v25;  // [bp-0x30]
    unsigned long long v26;  // [bp-0x28]
    unsigned long long v27;  // [bp-0x20]
    unsigned long long v28;  // [bp-0x18]
    char *v29;  // [bp-0x10]
    unsigned long long v30;  // [bp-0x8]
    char v31;  // [bp+0x0]

    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = v41;
    v29 = &v31;
    v30 = v42;
    v18 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v14 = a3[2];
    v15 = a3[3];
    v16 = a3[4];
    v17 = a3[5];
    v11 = *a3;
    v13 = a3[1];
    v10 = 0;
    v43 = a1->field_10;
    if (a1->field_10 != a1->field_18)
    {
        do
        {
            if (*(char *)v43 == 1 && !std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::compare(v43 + 6, 0, 9, "optimize ", 9))
            {
                v44 = _atoi(sub_a0c8(v43 + 6) + 9);
                v45 = (v44 < 2 ? v44 : 2);
                v11 = v45 & ~(v45 >> 31);
                if (*(char *)v43 != 1)
                    continue;
            }
            else if (*(char *)v43 != 1)
            {
                continue;
            }
            if (sub_9fd8(v43 + 6, "native"))
            {
                v10 |= 1;
                v11 = 2;
                v12 = 1;
            }
        } while ((v43 += 12, v43 != a1->field_18));
    }
    v7 = 0;
    v8 = 0;
    v9 = 0;
    v3 = &v2;
    v2 = &v3;
    v4 = &g_e64bc8;
    v5 = &v7;
    v6 = 0;
    sub_171a0(&v7, 16);
    (*(long long *)*(long long *)a1->field_0)();
}
