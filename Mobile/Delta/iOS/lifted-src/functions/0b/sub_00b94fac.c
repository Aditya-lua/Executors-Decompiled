/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb94fac..0xb950a4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b94fac_0 {
    struct st_b94fac_1 *field_0;
    struct st_b94fac_1 *field_8;
    char field_10;
} st_b94fac_0;

typedef struct st_b94fac_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_b94fac_1;


double sub_b94fac(st_b94fac_0 *a0, uint128_t *a1, uint128_t *a2, char a3)
{
    uint128_t *ptr;  // x0
    uint128_t v8;  // q1
    uint128_t v9;  // q1
    uint128_t *ptr1;  // x0
    uint128_t v11;  // q1
    uint128_t v12;  // q0
    uint128_t v13;  // q1
    uint128_t *v0;  // [bp-0x88]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    ptr = _malloc(64);
    if (ptr)
    {
        v8 = a1[1];
        *ptr = *a1;
        ptr[1] = v8;
        v9 = a1[3];
        ptr[2] = a1[2];
        ptr[3] = v9;
        v0 = ptr;
        v1 = *a2;
        v2 = a2[1];
        v3 = a2[2];
        v4 = a2[3];
        ptr1 = _malloc(64);
        if (ptr1)
        {
            v11 = a2[1];
            *ptr1 = *a2;
            ptr1[1] = v11;
            v12 = a2[2];
            v13 = a2[3];
            ptr1[2] = v12;
            ptr1[3] = v13;
            a0->field_0 = ptr;
            a0->field_8 = ptr1;
            a0->field_10 = a3;
            return *(unsigned long long *)&v12;
        }
        sub_c6ba70(8, 64);
    }
    else
    {
        sub_c6ba70(8, 64);
    }
    __debugbreak();
}
