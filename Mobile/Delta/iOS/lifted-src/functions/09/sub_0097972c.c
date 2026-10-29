/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97972c..0x979844 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97972c_2 {
    struct st_97972c_3 *field_0;
    char padding_8[96];
    char field_68;
    char padding_69[111];
    long long field_d8;
    char padding_e0[832];
    long long field_420;
    char padding_428[80];
    uint128_t field_478;
    char field_485;
    char padding_486[7];
    struct st_97972c_1 *field_48d;
    char padding_495[5];
    char field_49a;
    char padding_49b[49];
    char field_4cc;
    char padding_4cd[20];
    char field_4e1;
    char padding_4e2[318];
    unsigned long long field_620;
} st_97972c_2;

typedef struct st_97972c_0 {
    long long field_0;
    long long field_8;
} st_97972c_0;

typedef struct st_97972c_1 {
    uint128_t field_0;
    char field_d;
} st_97972c_1;

typedef struct st_97972c_4 {
    char field_0[21];
    char field_d;
} st_97972c_4;

typedef struct st_97972c_6 {
    struct st_97972c_4 *field_0;
    char padding_8[5];
    char field_d;
    char padding_e[389];
    unsigned long long field_193;
} st_97972c_6;

typedef struct st_97972c_5 {
    char field_0[21];
    char field_d;
    char padding_e[7];
    struct st_97972c_4 *field_15;
    char padding_1d[5];
    char field_22;
    char padding_23[389];
    unsigned long long field_1a8;
} st_97972c_5;

typedef struct st_97972c_3 {
    struct st_97972c_0 *field_0;
} st_97972c_3;

extern long long g_979bf8;

unsigned long long sub_97972c(st_97972c_2 *a0, unsigned long a1, st_97972c_1 *a2, st_97972c_1 *a3)
{
    unsigned long long v2;  // x0
    st_97972c_5 *v3;  // x21
    uint128_t v4;  // q0
    st_97972c_6 *v5;  // x8
    uint128_t v6;  // q0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9d34b4(&a0->field_68);
    if (!(unsigned int)v2)
        return v2;
    v3 = (a0->padding_428)[1];
    v4 = a2->field_0;
    *(long long *)&v3->field_0[13] = *(long long *)((char *)&a2->field_0 + 13);
    *(uint128_t *)&v3->field_0[0] = v4;
    *((char *)&a0->field_478 + 13) = 0;
    if (a3)
    {
        v5 = (char *)&a0->field_478 + 13;
        v6 = a3->field_0;
        *(long long *)&v5->field_d = *(long long *)((char *)&a3->field_0 + 13);
        *(uint128_t *)&v5->field_0 = v6;
    }
    v7 = sub_98b87c(a0->field_d8, &a0->field_68);
    if (!(unsigned int)v7)
        return v7;
    v8 = sub_98b7bc(a0->field_d8, &a0->padding_4cd[9]);
    if (!(unsigned int)v8)
        return v8;
    v9 = sub_98b81c(a0->field_d8, &a0->padding_49b[38]);
    if (!(unsigned int)v9)
        return v9;
    sub_985398(a0->field_420, &g_979bf8, a0);
    sub_98b8b0(a0->field_d8, &g_979bf8, a0);
    v10 = sub_985ac0(*(long long *)*(long long *)a0->field_0, *(long long *)(*(long long *)a0->field_0 + 8), v3, 1, 0, a0->field_420);
    if (!(unsigned int)v10)
        return v10;
    v11 = sub_98060c();
    if (!(unsigned int)v11)
        return v11;
    sub_978b1c(a0, 1);
    *(unsigned long long *)&a0->padding_4e2[307] = *(long long *)&a0->padding_4e2[307] & 0xffffffffffffffbf;
    return 1;
}
