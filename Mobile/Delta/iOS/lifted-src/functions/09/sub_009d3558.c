/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3558..0x9d35bc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d3558_1 {
    char padding_0[1];
    char field_1;
} st_9d3558_1;

typedef struct st_9d3558_0 {
    char padding_0[92];
    int field_5c;
} st_9d3558_0;


int sub_9d3558(st_9d3558_0 *ptr, st_9d3558_1 *a1)
{
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    *(uint128_t *)&ptr->field_5c = 0;
    memset(ptr, 0, 96);
    switch (a1->field_1)
    {
    case 1:
        break;
    case 2:
        break;
    case 30:
        break;
    default:
        return 0;
    }
    v0 = &v2;
    v1 = v4;
    _memcpy();
    return 1;
}
