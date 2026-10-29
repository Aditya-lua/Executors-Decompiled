/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d35bc..0x9d365c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d35bc_0 {
    char padding_0[1];
    char field_1;
} st_9d35bc_0;


long long * sub_9d35bc(st_9d35bc_0 *a0, long long *a1, long long *a2)
{
    long long *v2;  // w8
    unsigned long ptr;  // x20
    long long len;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long *)a0->field_1;
    switch (v2)
    {
    case 1:
        ptr = a0 + 1;
        len = _strlen(ptr);
        if (a1)
        {
LABEL_9d3608:
            _memcpy(a1, ptr, len);
        }
        break;
    case 30:
        ptr = a0 + 4;
        len = 16;
        if (a1)
            goto LABEL_9d3608;
        break;
    case 2:
        ptr = a0 + 2;
        len = 4;
        if (a1)
            goto LABEL_9d3608;
        break;
    default:
        return 0;
    }
    if (a2)
        *a2 = len;
    return 1;
}
