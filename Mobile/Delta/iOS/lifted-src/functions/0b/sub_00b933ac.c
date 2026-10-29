/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb933ac..0xb93510 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b933ac_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b933ac_2;

typedef struct st_b933ac_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_b933ac_0;

typedef struct st_b933ac_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    struct st_b933ac_0 *field_40;
    struct st_b933ac_0 *field_48;
} st_b933ac_1;


double sub_b933ac(st_b933ac_1 *a0, uint128_t *a1, st_b933ac_2 *a2, st_b933ac_2 *a3)
{
    st_b933ac_0 *ptr;  // x21
    st_b933ac_0 *ptr1;  // x0
    uint128_t v7;  // q1
    uint128_t v8;  // q0
    uint128_t v9;  // q1
    st_b933ac_0 *v0;  // [bp-0x80]
    uint248_t v1;  // [bp-0x77]
    uint320_t v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    *(uint128_t *)((char *)&v1 + 7) = a2->field_0;
    *(unsigned long long *)((char *)&v1 + 23) = a2->field_10;
    *(unsigned long long *)&v2 = 1;
    *((char *)&v2 + 8) = 0;
    *(uint128_t *)((char *)&v2 + 9) = *(uint128_t *)&v1;
    *(uint128_t *)((char *)&v2 + 24) = *(uint128_t *)((void*)&v1 + 15);
    ptr = _malloc(40);
    if (ptr)
    {
        ptr->field_0 = *(uint128_t *)&v2;
        ptr->field_10 = *(uint128_t *)((void*)&v2 + 16);
        ptr->field_20 = *(unsigned long long *)((void*)&v2 + 32);
        v0 = ptr;
        *(uint128_t *)((char *)&v1 + 7) = a3->field_0;
        *(unsigned long long *)((char *)&v1 + 23) = a3->field_10;
        *(unsigned long long *)&v2 = 1;
        *((char *)&v2 + 8) = 0;
        *(uint128_t *)((char *)&v2 + 9) = *(uint128_t *)&v1;
        *(uint128_t *)((char *)&v2 + 24) = *(uint128_t *)((void*)&v1 + 15);
        ptr1 = _malloc(40);
        if (ptr1)
        {
            ptr1->field_0 = *(uint128_t *)&v2;
            ptr1->field_10 = *(uint128_t *)((void*)&v2 + 16);
            ptr1->field_20 = *(unsigned long long *)((void*)&v2 + 32);
            v7 = a1[1];
            a0->field_0 = *a1;
            a0->field_10 = v7;
            v8 = a1[2];
            v9 = a1[3];
            a0->field_20 = v8;
            a0->field_30 = v9;
            a0->field_40 = v0;
            a0->field_48 = ptr1;
            return (unsigned long long)v8;
        }
        sub_c6ba70(8, 40);
    }
    else
    {
        sub_c6ba70(8, 40);
    }
    __debugbreak();
}
